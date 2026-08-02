package androidx.compose.ui.text;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class SaversKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaversKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AnnotationType annotationType;
        Object save;
        switch (this.$r8$classId) {
            case 0:
                AnnotatedString annotatedString = (AnnotatedString) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(annotatedString.text, SaversKt.save(annotatedString.annotations, SaversKt.AnnotationRangeListSaver, (SaveableHolder) obj));
            case 1:
                return Integer.valueOf(((ScrollState) obj2).value$delegate.getIntValue());
            case 2:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) obj2;
                Map map = saveableStateHolderImpl.savedStates;
                MutableScatterMap mutableScatterMap = saveableStateHolderImpl.registries;
                Object[] objArr = mutableScatterMap.keys;
                Object[] objArr2 = mutableScatterMap.values;
                long[] jArr = mutableScatterMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map performSave = ((SaveableStateRegistry) objArr2[i4]).performSave();
                                    if (performSave.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, performSave);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 5:
                return obj2;
            case 6:
                return Integer.valueOf(((TextDecoration) obj2).mask);
            case 7:
                TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(textGeometricTransform.scaleX), Float.valueOf(textGeometricTransform.skewX));
            case 8:
                SaveableHolder saveableHolder = (SaveableHolder) obj;
                TextIndent textIndent = (TextIndent) obj2;
                TextUnit textUnit = new TextUnit(textIndent.firstLine);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.TextUnitSaver;
                return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(textUnit, saversKt$NonNullValueClassSaver$1, saveableHolder), SaversKt.save(new TextUnit(textIndent.restLine), saversKt$NonNullValueClassSaver$1, saveableHolder));
            case 9:
                return Integer.valueOf(((FontWeight) obj2).weight);
            case 10:
                LinkAnnotation.Url url = (LinkAnnotation.Url) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(url.getUrl(), SaversKt.save(url.getStyles(), SaversKt.TextLinkStylesSaver, (SaveableHolder) obj));
            case 11:
                return Float.valueOf(((BaselineShift) obj2).multiplier);
            case 12:
                SaveableHolder saveableHolder2 = (SaveableHolder) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(SaversKt.save((AnnotatedString.Range) list.get(i5), SaversKt.AnnotationRangeSaver, saveableHolder2));
                }
                return arrayList;
            case 13:
                TextRange textRange = (TextRange) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf((int) (textRange.packedValue >> 32)), Integer.valueOf((int) (textRange.packedValue & BodyPartID.bodyIdMax)));
            case 14:
                SaveableHolder saveableHolder3 = (SaveableHolder) obj;
                Shadow shadow = (Shadow) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(new Color(shadow.color), SaversKt.ColorSaver, saveableHolder3), SaversKt.save(new Offset(shadow.offset), SaversKt.OffsetSaver, saveableHolder3), Float.valueOf(shadow.blurRadius));
            case 15:
                return Integer.valueOf(((TextAlign) obj2).value);
            case 16:
                return Integer.valueOf(((TextDirection) obj2).value);
            case 17:
                return Integer.valueOf(((Hyphens) obj2).value);
            case 18:
                return Integer.valueOf(((FontStyle) obj2).value);
            case 19:
                return Integer.valueOf(((FontSynthesis) obj2).value);
            case 20:
                TextUnit textUnit2 = (TextUnit) obj2;
                return textUnit2 != null ? TextUnit.m1057equalsimpl0(textUnit2.packedValue, TextUnit.Unspecified) : false ? Boolean.FALSE : CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(TextUnit.m1059getValueimpl(textUnit2.packedValue)), SaversKt.save(new TextUnitType(TextUnit.m1058getTypeUIouoOA(textUnit2.packedValue)), SaversKt.TextUnitTypeSaver, (SaveableHolder) obj));
            case 21:
                LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(clickable.getTag(), SaversKt.save(clickable.getStyles(), SaversKt.TextLinkStylesSaver, (SaveableHolder) obj));
            case 22:
                long j2 = ((TextUnitType) obj2).f861type;
                if (TextUnitType.m1062equalsimpl0(j2, 8589934592L)) {
                    return 0;
                }
                if (TextUnitType.m1062equalsimpl0(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 23:
                Offset offset = (Offset) obj2;
                return offset != null ? Offset.m622equalsimpl0(offset.packedValue, 9205357640488583168L) : false ? Boolean.FALSE : CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(Float.intBitsToFloat((int) (offset.packedValue >> 32))), Float.valueOf(Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax))));
            case 24:
                SaveableHolder saveableHolder4 = (SaveableHolder) obj;
                AnnotatedString.Range range = (AnnotatedString.Range) obj2;
                Object obj4 = range.item;
                if (obj4 instanceof ParagraphStyle) {
                    annotationType = AnnotationType.Paragraph;
                } else if (obj4 instanceof SpanStyle) {
                    annotationType = AnnotationType.Span;
                } else if (obj4 instanceof VerbatimTtsAnnotation) {
                    annotationType = AnnotationType.VerbatimTts;
                } else if (obj4 instanceof UrlAnnotation) {
                    annotationType = AnnotationType.Url;
                } else if (obj4 instanceof LinkAnnotation.Url) {
                    annotationType = AnnotationType.Link;
                } else if (obj4 instanceof LinkAnnotation.Clickable) {
                    annotationType = AnnotationType.Clickable;
                } else {
                    if (!(obj4 instanceof StringAnnotation)) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return null;
                    }
                    annotationType = AnnotationType.String;
                }
                switch (annotationType.ordinal()) {
                    case 0:
                        obj4.getClass();
                        save = SaversKt.save((ParagraphStyle) obj4, SaversKt.ParagraphStyleSaver, saveableHolder4);
                        break;
                    case 1:
                        obj4.getClass();
                        save = SaversKt.save((SpanStyle) obj4, SaversKt.SpanStyleSaver, saveableHolder4);
                        break;
                    case 2:
                        obj4.getClass();
                        save = SaversKt.save((VerbatimTtsAnnotation) obj4, SaversKt.VerbatimTtsAnnotationSaver, saveableHolder4);
                        break;
                    case 3:
                        obj4.getClass();
                        save = SaversKt.save((UrlAnnotation) obj4, SaversKt.UrlAnnotationSaver, saveableHolder4);
                        break;
                    case 4:
                        obj4.getClass();
                        save = SaversKt.save((LinkAnnotation.Url) obj4, SaversKt.LinkSaver, saveableHolder4);
                        break;
                    case 5:
                        obj4.getClass();
                        save = SaversKt.save((LinkAnnotation.Clickable) obj4, SaversKt.ClickableSaver, saveableHolder4);
                        break;
                    case 6:
                        obj4.getClass();
                        save = ((StringAnnotation) obj4).m977unboximpl();
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                return CollectionsKt__CollectionsKt.arrayListOf(annotationType, save, Integer.valueOf(range.start), Integer.valueOf(range.end), range.tag);
            case 25:
                SaveableHolder saveableHolder5 = (SaveableHolder) obj;
                List list2 = ((LocaleList) obj2).localeList;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(SaversKt.save((Locale) list2.get(i6), SaversKt.LocaleSaver, saveableHolder5));
                }
                return arrayList2;
            case 26:
                return ((Locale) obj2).platformLocale.toLanguageTag();
            case 27:
                SaveableHolder saveableHolder6 = (SaveableHolder) obj;
                LineHeightStyle lineHeightStyle = (LineHeightStyle) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(new LineHeightStyle.Alignment(lineHeightStyle.alignment), SaversKt.LineHeightStyleAlignmentSaver, saveableHolder6), SaversKt.save(new LineHeightStyle.Trim(lineHeightStyle.trim), SaversKt.LineHeightStyleTrimSaver, saveableHolder6), SaversKt.save(new LineHeightStyle.Mode(lineHeightStyle.mode), SaversKt.LineHeightStyleModeSaver, saveableHolder6));
            case 28:
                return Float.valueOf(((LineHeightStyle.Alignment) obj2).topRatio);
            default:
                return Integer.valueOf(((LineHeightStyle.Trim) obj2).value);
        }
    }
}
