package androidx.compose.ui.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.work.impl.WorkLauncherImpl;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.internal.ThreadState;
import papa.AndroidComponentEvent;
import papa.AppStart$AppStartData;

/* loaded from: classes.dex */
public final /* synthetic */ class SaversKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaversKt$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        switch (this.$r8$classId) {
            case 0:
                SaveableHolder saveableHolder = (SaveableHolder) obj;
                ParagraphStyle paragraphStyle = (ParagraphStyle) obj2;
                Object save = SaversKt.save(new TextAlign(paragraphStyle.textAlign), SaversKt.TextAlignSaver, saveableHolder);
                Object save2 = SaversKt.save(new TextDirection(paragraphStyle.textDirection), SaversKt.TextDirectionSaver, saveableHolder);
                Object save3 = SaversKt.save(new TextUnit(paragraphStyle.lineHeight), SaversKt.TextUnitSaver, saveableHolder);
                TextIndent textIndent = paragraphStyle.textIndent;
                TextIndent textIndent2 = TextIndent.None;
                Object save4 = SaversKt.save(textIndent, SaversKt.TextIndentSaver, saveableHolder);
                Object save5 = SaversKt.save(paragraphStyle.platformStyle, TextPainterKt.PlatformParagraphStyleSaver, saveableHolder);
                LineHeightStyle lineHeightStyle = paragraphStyle.lineHeightStyle;
                LineHeightStyle lineHeightStyle2 = LineHeightStyle.Default;
                return CollectionsKt__CollectionsKt.arrayListOf(save, save2, save3, save4, save5, SaversKt.save(lineHeightStyle, SaversKt.LineHeightStyleSaver, saveableHolder), SaversKt.save(new LineBreak(paragraphStyle.lineBreak), TextPainterKt.LineBreakSaver, saveableHolder), SaversKt.save(new Hyphens(paragraphStyle.hyphens), SaversKt.HyphensSaver, saveableHolder), SaversKt.save(paragraphStyle.textMotion, TextPainterKt.TextMotionSaver, saveableHolder));
            case 1:
                return Integer.valueOf(((LineHeightStyle.Mode) obj2).value);
            case 2:
                return ((VerbatimTtsAnnotation) obj2).getVerbatim();
            case 3:
                return ((UrlAnnotation) obj2).getUrl();
            case 4:
                SaveableHolder saveableHolder2 = (SaveableHolder) obj;
                SpanStyle spanStyle = (SpanStyle) obj2;
                Color color = new Color(spanStyle.textForegroundStyle.mo1007getColor0d7_KjU());
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.ColorSaver;
                Object save6 = SaversKt.save(color, saversKt$NonNullValueClassSaver$1, saveableHolder2);
                TextUnit textUnit = new TextUnit(spanStyle.fontSize);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.TextUnitSaver;
                Object save7 = SaversKt.save(textUnit, saversKt$NonNullValueClassSaver$12, saveableHolder2);
                FontWeight fontWeight = spanStyle.fontWeight;
                FontWeight fontWeight2 = FontWeight.W400;
                Object save8 = SaversKt.save(fontWeight, SaversKt.FontWeightSaver, saveableHolder2);
                Object save9 = SaversKt.save(spanStyle.fontStyle, SaversKt.FontStyleSaver, saveableHolder2);
                Object save10 = SaversKt.save(spanStyle.fontSynthesis, SaversKt.FontSynthesisSaver, saveableHolder2);
                String str = spanStyle.fontFeatureSettings;
                Object save11 = SaversKt.save(new TextUnit(spanStyle.letterSpacing), saversKt$NonNullValueClassSaver$12, saveableHolder2);
                Object save12 = SaversKt.save(spanStyle.baselineShift, SaversKt.BaselineShiftSaver, saveableHolder2);
                Object save13 = SaversKt.save(spanStyle.textGeometricTransform, SaversKt.TextGeometricTransformSaver, saveableHolder2);
                LocaleList localeList = spanStyle.localeList;
                LocaleList localeList2 = LocaleList.Empty;
                Object save14 = SaversKt.save(localeList, SaversKt.LocaleListSaver, saveableHolder2);
                Object save15 = SaversKt.save(new Color(spanStyle.background), saversKt$NonNullValueClassSaver$1, saveableHolder2);
                Object save16 = SaversKt.save(spanStyle.textDecoration, SaversKt.TextDecorationSaver, saveableHolder2);
                Shadow shadow = spanStyle.shadow;
                Shadow shadow2 = Shadow.None;
                return CollectionsKt__CollectionsKt.arrayListOf(save6, save7, save8, save9, save10, -1, str, save11, save12, save13, save14, save15, save16, SaversKt.save(shadow, SaversKt.ShadowSaver, saveableHolder2));
            case 5:
                SaveableHolder saveableHolder3 = (SaveableHolder) obj;
                TextLinkStyles textLinkStyles = (TextLinkStyles) obj2;
                SpanStyle style = textLinkStyles.getStyle();
                WorkLauncherImpl workLauncherImpl = SaversKt.SpanStyleSaver;
                return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(style, workLauncherImpl, saveableHolder3), SaversKt.save(textLinkStyles.getFocusedStyle(), workLauncherImpl, saveableHolder3), SaversKt.save(textLinkStyles.getHoveredStyle(), workLauncherImpl, saveableHolder3), SaversKt.save(textLinkStyles.getPressedStyle(), workLauncherImpl, saveableHolder3));
            case 6:
                SaveableHolder saveableHolder4 = (SaveableHolder) obj;
                TextFieldValue textFieldValue = (TextFieldValue) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(textFieldValue.annotatedString, SaversKt.AnnotatedStringSaver, saveableHolder4), SaversKt.save(new TextRange(textFieldValue.selection), SaversKt.TextRangeSaver, saveableHolder4));
            case 7:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element.getClass();
                CoroutineContext minusKey = coroutineContext.minusKey(element.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (minusKey == emptyCoroutineContext) {
                    return element;
                }
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(key);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(element, minusKey);
                } else {
                    CoroutineContext minusKey2 = minusKey.minusKey(key);
                    if (minusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(continuationInterceptor, element);
                    }
                    combinedContext = new CombinedContext(continuationInterceptor, new CombinedContext(element, minusKey2));
                }
                return combinedContext;
            case 9:
                ((Links) obj).getClass();
                ((Links) obj2).getClass();
                return Boolean.TRUE;
            case 10:
                ((Links) obj).getClass();
                ((Links) obj2).getClass();
                return Boolean.TRUE;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 12:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 13:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 14:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            case 15:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 16:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (!(element2 instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue2 = num != null ? num.intValue() : 1;
                return intValue2 == 0 ? element2 : Integer.valueOf(intValue2 + 1);
            case 17:
                ThreadContextElement threadContextElement = (ThreadContextElement) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (threadContextElement != null) {
                    return threadContextElement;
                }
                if (element3 instanceof ThreadContextElement) {
                    return (ThreadContextElement) element3;
                }
                return null;
            case 18:
                ThreadState threadState = (ThreadState) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (element4 instanceof ThreadContextElement) {
                    ThreadContextElement threadContextElement2 = (ThreadContextElement) element4;
                    CoroutineContext coroutineContext2 = threadState.context;
                    threadState.append(threadContextElement2, threadContextElement2.updateThreadContext());
                }
                return threadState;
            case 19:
                AppStart$AppStartData appStart$AppStartData = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent = (AndroidComponentEvent) obj2;
                appStart$AppStartData.getClass();
                androidComponentEvent.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData, null, null, null, null, null, null, null, androidComponentEvent, null, null, null, null, null, null, -8388609);
            case 20:
                AppStart$AppStartData appStart$AppStartData2 = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent2 = (AndroidComponentEvent) obj2;
                appStart$AppStartData2.getClass();
                androidComponentEvent2.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData2, null, null, null, null, null, null, null, null, null, null, androidComponentEvent2, null, null, null, -67108865);
            case 21:
                AppStart$AppStartData appStart$AppStartData3 = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent3 = (AndroidComponentEvent) obj2;
                appStart$AppStartData3.getClass();
                androidComponentEvent3.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData3, null, null, null, null, null, null, null, null, null, null, null, null, androidComponentEvent3, null, -268435457);
            case 22:
                AppStart$AppStartData appStart$AppStartData4 = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent4 = (AndroidComponentEvent) obj2;
                appStart$AppStartData4.getClass();
                androidComponentEvent4.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData4, null, null, null, null, null, null, null, null, null, null, null, androidComponentEvent4, null, null, -134217729);
            case 23:
                AppStart$AppStartData appStart$AppStartData5 = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent5 = (AndroidComponentEvent) obj2;
                appStart$AppStartData5.getClass();
                androidComponentEvent5.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData5, null, null, null, null, null, null, androidComponentEvent5, null, null, null, null, null, null, null, -4194305);
            case 24:
                AppStart$AppStartData appStart$AppStartData6 = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent6 = (AndroidComponentEvent) obj2;
                appStart$AppStartData6.getClass();
                androidComponentEvent6.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData6, null, null, null, null, null, null, null, null, null, androidComponentEvent6, null, null, null, null, -33554433);
            default:
                AppStart$AppStartData appStart$AppStartData7 = (AppStart$AppStartData) obj;
                AndroidComponentEvent androidComponentEvent7 = (AndroidComponentEvent) obj2;
                appStart$AppStartData7.getClass();
                androidComponentEvent7.getClass();
                return AppStart$AppStartData.copy$default(appStart$AppStartData7, null, null, null, null, null, null, null, null, androidComponentEvent7, null, null, null, null, null, -16777217);
        }
    }
}
