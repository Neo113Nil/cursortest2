package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.EncodeHelper;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldSelectionManager$cut$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager$cut$1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        switch (i) {
            case 0:
                return new TextFieldSelectionManager$cut$1(textFieldSelectionManager, continuation, 0);
            case 1:
                TextFieldSelectionManager$cut$1 textFieldSelectionManager$cut$1 = new TextFieldSelectionManager$cut$1(textFieldSelectionManager, continuation, 1);
                long j = ((Offset) obj).packedValue;
                return textFieldSelectionManager$cut$1;
            default:
                return new TextFieldSelectionManager$cut$1(textFieldSelectionManager, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((TextFieldSelectionManager$cut$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                long j = ((Offset) obj).packedValue;
                return new TextFieldSelectionManager$cut$1(this.this$0, (Continuation) obj2, 1).invokeSuspend(Unit.INSTANCE);
            default:
                return ((TextFieldSelectionManager$cut$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0046, code lost:
    
        if (r7 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0386, code lost:
    
        if (r0 == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0363, code lost:
    
        if (r5.updateClipboardEntry$foundation(r45) == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02c2, code lost:
    
        if (r0 == r1) goto L141;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        AnnotatedString annotatedString;
        Object obj2;
        Object obj3;
        CharSequence text;
        CharSequence charSequence;
        byte b;
        byte b2;
        int i2 = this.$r8$classId;
        byte b3 = 1;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (TextRange.m987getCollapsedimpl(textFieldSelectionManager.getValue$foundation().selection) || !textFieldSelectionManager.getEditable()) {
                        i = 1;
                        annotatedString = null;
                    } else {
                        annotatedString = TextFieldValueKt.getSelectedText(textFieldSelectionManager.getValue$foundation());
                        AnnotatedString textBeforeSelection = TextFieldValueKt.getTextBeforeSelection(textFieldSelectionManager.getValue$foundation(), textFieldSelectionManager.getValue$foundation().annotatedString.text.length());
                        AnnotatedString textAfterSelection = TextFieldValueKt.getTextAfterSelection(textFieldSelectionManager.getValue$foundation(), textFieldSelectionManager.getValue$foundation().annotatedString.text.length());
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(textBeforeSelection);
                        builder.append(textAfterSelection);
                        AnnotatedString annotatedString2 = builder.toAnnotatedString();
                        int m990getMinimpl = TextRange.m990getMinimpl(textFieldSelectionManager.getValue$foundation().selection);
                        textFieldSelectionManager.onValueChange.invoke(TextFieldSelectionManager.m455createTextFieldValueFDrldGo(annotatedString2, SizeKt.TextRange(m990getMinimpl, m990getMinimpl)));
                        textFieldSelectionManager.setHandleState(HandleState.None);
                        i = 1;
                        textFieldSelectionManager.undoManager.forceNextSnapshot = true;
                    }
                    if (annotatedString != null) {
                        AndroidClipboard androidClipboard = textFieldSelectionManager.clipboard;
                        if (androidClipboard != null) {
                            ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(annotatedString);
                            this.label = i;
                            if (androidClipboard.setClipEntry(clipEntry) == coroutineSingletons) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Pair access$getContextTextAndSelection = TextFieldSelectionManager.access$getContextTextAndSelection(textFieldSelectionManager);
                if (access$getContextTextAndSelection != null) {
                    String str = (String) access$getContextTextAndSelection.first;
                    long j = ((TextRange) access$getContextTextAndSelection.second).packedValue;
                    PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = textFieldSelectionManager.platformSelectionBehaviors;
                    if (platformSelectionBehaviorsImpl != null) {
                        this.label = 2;
                        Object m438onShowContextMenuOrSelectionToolbarSbBc2M = platformSelectionBehaviorsImpl.m438onShowContextMenuOrSelectionToolbarSbBc2M(str, j, this);
                        if (m438onShowContextMenuOrSelectionToolbarSbBc2M != coroutineSingletons2) {
                            m438onShowContextMenuOrSelectionToolbarSbBc2M = Unit.INSTANCE;
                            break;
                        }
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidClipboard androidClipboard2 = textFieldSelectionManager.clipboard;
                    if (androidClipboard2 != null) {
                        this.label = 1;
                        ClipData primaryClip = androidClipboard2.androidClipboardManager.getClipboardManager().getPrimaryClip();
                        if (primaryClip == null) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = new ClipEntry(primaryClip);
                            break;
                        }
                    }
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    obj3 = obj;
                    AnnotatedString annotatedString3 = (AnnotatedString) obj3;
                    if (annotatedString3 != null) {
                        if (textFieldSelectionManager.getEditable()) {
                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(TextFieldValueKt.getTextBeforeSelection(textFieldSelectionManager.getValue$foundation(), textFieldSelectionManager.getValue$foundation().annotatedString.text.length()));
                            builder2.append(annotatedString3);
                            AnnotatedString annotatedString4 = builder2.toAnnotatedString();
                            AnnotatedString textAfterSelection2 = TextFieldValueKt.getTextAfterSelection(textFieldSelectionManager.getValue$foundation(), textFieldSelectionManager.getValue$foundation().annotatedString.text.length());
                            AnnotatedString.Builder builder3 = new AnnotatedString.Builder(annotatedString4);
                            builder3.append(textAfterSelection2);
                            AnnotatedString annotatedString5 = builder3.toAnnotatedString();
                            int length = annotatedString3.text.length() + TextRange.m990getMinimpl(textFieldSelectionManager.getValue$foundation().selection);
                            textFieldSelectionManager.onValueChange.invoke(TextFieldSelectionManager.m455createTextFieldValueFDrldGo(annotatedString5, SizeKt.TextRange(length, length)));
                            textFieldSelectionManager.setHandleState(HandleState.None);
                            textFieldSelectionManager.undoManager.forceNextSnapshot = true;
                        }
                        break;
                    }
                    break;
                }
                ClipEntry clipEntry2 = (ClipEntry) obj2;
                if (clipEntry2 != null) {
                    this.label = 2;
                    byte b4 = 0;
                    ClipData.Item itemAt = clipEntry2.clipData.getItemAt(0);
                    if (itemAt != null && (text = itemAt.getText()) != null) {
                        if (!(text instanceof Spanned)) {
                            obj3 = new AnnotatedString(text.toString());
                            break;
                        } else {
                            Spanned spanned = (Spanned) text;
                            Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                            ArrayList arrayList = new ArrayList();
                            annotationArr.getClass();
                            int length2 = annotationArr.length - 1;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    Annotation annotation = annotationArr[i6];
                                    if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                        int spanStart = spanned.getSpanStart(annotation);
                                        int spanEnd = spanned.getSpanEnd(annotation);
                                        String value = annotation.getValue();
                                        EncodeHelper encodeHelper = new EncodeHelper();
                                        Parcel obtain = Parcel.obtain();
                                        encodeHelper.parcel = obtain;
                                        byte[] decode = Base64.decode(value, b4);
                                        obtain.unmarshall(decode, b4, decode.length);
                                        obtain.setDataPosition(b4);
                                        Parcel parcel = encodeHelper.parcel;
                                        long j2 = Color.Unspecified;
                                        long j3 = j2;
                                        long j4 = TextUnit.Unspecified;
                                        long j5 = j4;
                                        FontWeight fontWeight = null;
                                        FontStyle fontStyle = null;
                                        FontSynthesis fontSynthesis = null;
                                        String str2 = null;
                                        BaselineShift baselineShift = null;
                                        TextGeometricTransform textGeometricTransform = null;
                                        TextDecoration textDecoration = null;
                                        Shadow shadow = null;
                                        while (parcel.dataAvail() > b3) {
                                            byte readByte = parcel.readByte();
                                            if (readByte != b3) {
                                                b = b4;
                                                if (readByte == 2) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        j4 = encodeHelper.m930decodeTextUnitXSAIIZE();
                                                        b4 = b;
                                                    } else {
                                                        charSequence = text;
                                                        arrayList.add(new AnnotatedString.Range(new SpanStyle(j2, j4, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str2, j5, baselineShift, textGeometricTransform, (LocaleList) null, j3, textDecoration, shadow, 49152), spanStart, spanEnd));
                                                    }
                                                } else if (readByte != 3) {
                                                    if (readByte == 4) {
                                                        if (parcel.dataAvail() >= b3) {
                                                            byte readByte2 = parcel.readByte();
                                                            FontStyle fontStyle2 = new FontStyle((readByte2 != 0 && readByte2 == b3) ? b3 : b);
                                                            b4 = b;
                                                            fontStyle = fontStyle2;
                                                        } else {
                                                            charSequence = text;
                                                        }
                                                    } else if (readByte != 5) {
                                                        if (readByte == 6) {
                                                            str2 = parcel.readString();
                                                        } else if (readByte == 7) {
                                                            if (parcel.dataAvail() >= 5) {
                                                                j5 = encodeHelper.m930decodeTextUnitXSAIIZE();
                                                            } else {
                                                                charSequence = text;
                                                            }
                                                        } else if (readByte == 8) {
                                                            if (parcel.dataAvail() >= 4) {
                                                                b4 = b;
                                                                baselineShift = new BaselineShift(parcel.readFloat());
                                                            } else {
                                                                charSequence = text;
                                                            }
                                                        } else if (readByte != 9) {
                                                            if (readByte != 10) {
                                                                if (readByte != 11) {
                                                                    charSequence = text;
                                                                    if (readByte == 12) {
                                                                        if (parcel.dataAvail() >= 20) {
                                                                            long m929decodeColor0d7_KjU = encodeHelper.m929decodeColor0d7_KjU();
                                                                            Parcel parcel2 = parcel;
                                                                            long floatToRawIntBits = (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & BodyPartID.bodyIdMax);
                                                                            b4 = b;
                                                                            text = charSequence;
                                                                            parcel = parcel2;
                                                                            shadow = new Shadow(parcel2.readFloat(), m929decodeColor0d7_KjU, floatToRawIntBits);
                                                                            b3 = 1;
                                                                        }
                                                                    }
                                                                } else if (parcel.dataAvail() >= 4) {
                                                                    int readInt = parcel.readInt();
                                                                    byte b5 = (readInt & 2) != 0 ? b3 : b;
                                                                    byte b6 = (readInt & 1) != 0 ? b3 : b;
                                                                    TextDecoration textDecoration2 = TextDecoration.LineThrough;
                                                                    TextDecoration textDecoration3 = TextDecoration.Underline;
                                                                    if (b5 == 0 || b6 == 0) {
                                                                        charSequence = text;
                                                                        textDecoration = b5 != 0 ? textDecoration2 : b6 != 0 ? textDecoration3 : TextDecoration.None;
                                                                    } else {
                                                                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TextDecoration[]{textDecoration2, textDecoration3});
                                                                        Integer valueOf = Integer.valueOf(b);
                                                                        int size = listOf.size();
                                                                        int i7 = b;
                                                                        while (i7 < size) {
                                                                            valueOf = Integer.valueOf(((TextDecoration) listOf.get(i7)).mask | valueOf.intValue());
                                                                            i7++;
                                                                            text = text;
                                                                        }
                                                                        charSequence = text;
                                                                        textDecoration = new TextDecoration(valueOf.intValue());
                                                                    }
                                                                }
                                                                b4 = b;
                                                                text = charSequence;
                                                                b3 = 1;
                                                            } else if (parcel.dataAvail() >= 8) {
                                                                j3 = encodeHelper.m929decodeColor0d7_KjU();
                                                            }
                                                            charSequence = text;
                                                        } else if (parcel.dataAvail() >= 8) {
                                                            textGeometricTransform = new TextGeometricTransform(parcel.readFloat(), parcel.readFloat());
                                                        } else {
                                                            charSequence = text;
                                                        }
                                                        b4 = b;
                                                    } else if (parcel.dataAvail() >= b3) {
                                                        byte readByte3 = parcel.readByte();
                                                        if (readByte3 != 0) {
                                                            if (readByte3 == b3) {
                                                                b2 = 65535;
                                                            } else if (readByte3 == 3) {
                                                                b2 = 2;
                                                            } else if (readByte3 == 2) {
                                                                b2 = b3;
                                                            }
                                                            FontSynthesis fontSynthesis2 = new FontSynthesis(b2);
                                                            b4 = b;
                                                            fontSynthesis = fontSynthesis2;
                                                        }
                                                        b2 = b;
                                                        FontSynthesis fontSynthesis22 = new FontSynthesis(b2);
                                                        b4 = b;
                                                        fontSynthesis = fontSynthesis22;
                                                    } else {
                                                        charSequence = text;
                                                    }
                                                    arrayList.add(new AnnotatedString.Range(new SpanStyle(j2, j4, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str2, j5, baselineShift, textGeometricTransform, (LocaleList) null, j3, textDecoration, shadow, 49152), spanStart, spanEnd));
                                                } else if (parcel.dataAvail() >= 4) {
                                                    fontWeight = new FontWeight(parcel.readInt());
                                                    b4 = b;
                                                } else {
                                                    charSequence = text;
                                                    arrayList.add(new AnnotatedString.Range(new SpanStyle(j2, j4, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str2, j5, baselineShift, textGeometricTransform, (LocaleList) null, j3, textDecoration, shadow, 49152), spanStart, spanEnd));
                                                }
                                            } else if (parcel.dataAvail() >= 8) {
                                                j2 = encodeHelper.m929decodeColor0d7_KjU();
                                            } else {
                                                charSequence = text;
                                                b = b4;
                                                arrayList.add(new AnnotatedString.Range(new SpanStyle(j2, j4, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str2, j5, baselineShift, textGeometricTransform, (LocaleList) null, j3, textDecoration, shadow, 49152), spanStart, spanEnd));
                                            }
                                        }
                                        charSequence = text;
                                        b = b4;
                                        arrayList.add(new AnnotatedString.Range(new SpanStyle(j2, j4, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str2, j5, baselineShift, textGeometricTransform, (LocaleList) null, j3, textDecoration, shadow, 49152), spanStart, spanEnd));
                                    } else {
                                        charSequence = text;
                                        b = b4;
                                    }
                                    if (i6 != length2) {
                                        i6++;
                                        b4 = b;
                                        text = charSequence;
                                        b3 = 1;
                                    }
                                }
                            } else {
                                charSequence = text;
                            }
                            obj3 = new AnnotatedString(charSequence.toString(), arrayList);
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
