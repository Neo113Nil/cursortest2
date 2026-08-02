package androidx.compose.foundation.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.emoji2.text.EmojiCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class BasicTextKt$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BasicTextKt$$ExternalSyntheticLambda14(int i, LazyListMeasureResult lazyListMeasureResult) {
        this.$r8$classId = 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        TextLinkStyles styles;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                List list = (List) obj;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                List list2 = (List) obj;
                break;
            case 8:
                ((Integer) obj).intValue();
                break;
            case 9:
                ((Integer) obj).getClass();
                LazyGridMeasureResult lazyGridMeasureResult = LazyGridStateKt.EmptyLazyGridLayoutInfo;
                break;
            case 10:
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list3.get(1);
                obj3.getClass();
                break;
            case 11:
                break;
            case 12:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.SelectableGroup;
                Unit unit = Unit.INSTANCE;
                ((SemanticsPropertyReceiver) obj).set(semanticsPropertyKey, unit);
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
                String str = textFieldPreparedSelection.annotatedString.text;
                long j = textFieldPreparedSelection.selection;
                int i2 = TextRange.$r8$clinit;
                int i3 = (int) (j & BodyPartID.bodyIdMax);
                if (i3 > 0) {
                    EmojiCompat emojiCompatIfLoaded = KeyMappingKt.getEmojiCompatIfLoaded();
                    if (emojiCompatIfLoaded != null) {
                        int emojiStart = emojiCompatIfLoaded.getEmojiStart(i3 - 1, str);
                        if (emojiStart >= 0) {
                            i = emojiStart;
                        } else if (i3 > 0) {
                            i = Character.offsetByCodePoints(str, i3, -1);
                        }
                        if (i != -1) {
                        }
                    } else if (i3 > 0) {
                        i = Character.offsetByCodePoints(str, i3, -1);
                        if (i != -1) {
                            break;
                        }
                    }
                }
                i = -1;
                if (i != -1) {
                }
                break;
            case 18:
                TextFieldPreparedSelection textFieldPreparedSelection2 = (TextFieldPreparedSelection) obj;
                String str2 = textFieldPreparedSelection2.annotatedString.text;
                long j2 = textFieldPreparedSelection2.selection;
                int i4 = TextRange.$r8$clinit;
                int findFollowingBreak = KeyMappingKt.findFollowingBreak((int) (j2 & BodyPartID.bodyIdMax), str2);
                if (findFollowingBreak != -1) {
                    break;
                }
                break;
            case 19:
                TextFieldPreparedSelection textFieldPreparedSelection3 = (TextFieldPreparedSelection) obj;
                Integer previousWordOffset = textFieldPreparedSelection3.getPreviousWordOffset();
                if (previousWordOffset != null) {
                    int intValue2 = previousWordOffset.intValue();
                    long j3 = textFieldPreparedSelection3.selection;
                    int i5 = TextRange.$r8$clinit;
                    break;
                }
                break;
            case 20:
                TextFieldPreparedSelection textFieldPreparedSelection4 = (TextFieldPreparedSelection) obj;
                Integer nextWordOffset = textFieldPreparedSelection4.getNextWordOffset();
                if (nextWordOffset != null) {
                    int intValue3 = nextWordOffset.intValue();
                    long j4 = textFieldPreparedSelection4.selection;
                    int i6 = TextRange.$r8$clinit;
                    break;
                }
                break;
            case 21:
                TextFieldPreparedSelection textFieldPreparedSelection5 = (TextFieldPreparedSelection) obj;
                Integer lineStartByOffset = textFieldPreparedSelection5.getLineStartByOffset();
                if (lineStartByOffset != null) {
                    int intValue4 = lineStartByOffset.intValue();
                    long j5 = textFieldPreparedSelection5.selection;
                    int i7 = TextRange.$r8$clinit;
                    break;
                }
                break;
            case 22:
                TextFieldPreparedSelection textFieldPreparedSelection6 = (TextFieldPreparedSelection) obj;
                Integer lineEndByOffset = textFieldPreparedSelection6.getLineEndByOffset();
                if (lineEndByOffset != null) {
                    int intValue5 = lineEndByOffset.intValue();
                    long j6 = textFieldPreparedSelection6.selection;
                    int i8 = TextRange.$r8$clinit;
                    break;
                }
                break;
            case 23:
                List list4 = (List) obj;
                Object obj4 = list4.get(1);
                obj4.getClass();
                Orientation orientation = ((Boolean) obj4).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
                Object obj5 = list4.get(0);
                obj5.getClass();
                break;
            case 24:
                AnnotatedString.Range range = (AnnotatedString.Range) obj;
                Object obj6 = range.item;
                if ((obj6 instanceof LinkAnnotation) && (styles = ((LinkAnnotation) obj6).getStyles()) != null && (styles.style != null || styles.focusedStyle != null || styles.hoveredStyle != null || styles.pressedStyle != null)) {
                    Object obj7 = range.item;
                    obj7.getClass();
                    TextLinkStyles styles2 = ((LinkAnnotation) obj7).getStyles();
                    if (styles2 == null || (r2 = styles2.style) == null) {
                        SpanStyle spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65535);
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 25:
                SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.LinkTestMarker;
                Unit unit2 = Unit.INSTANCE;
                ((SemanticsPropertyReceiver) obj).set(semanticsPropertyKey2, unit2);
                break;
            case 26:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i9);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str3 = activityInfo.permission;
                            if (str3 != null && context.checkSelfPermission(str3) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                break;
            case 27:
                ((Long) obj).longValue();
                break;
            case 28:
                ((TextFieldBuffer) obj).m378setCompositionOEnZFl4(null);
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BasicTextKt$$ExternalSyntheticLambda14(int i) {
        this.$r8$classId = i;
    }
}
