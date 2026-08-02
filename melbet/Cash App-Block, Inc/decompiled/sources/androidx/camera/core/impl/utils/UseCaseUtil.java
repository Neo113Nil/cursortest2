package androidx.camera.core.impl.utils;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.extractor.text.CueEncoder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes3.dex */
public abstract class UseCaseUtil {
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ImageView(ComposePlatform.Image image, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        final String evalString;
        Color color;
        long j;
        image.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-895260380);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(image) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            if (gapComposer.consume(GenieCompositionLocalsKt.LocalGenieImageLoader) != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            boolean isSystemInDarkTheme = ImageKt.isSystemInDarkTheme(gapComposer);
            final String evalString2 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, image.resource_name);
            Object obj = null;
            if (evalString2 != null) {
                if (evalString2.length() <= 0) {
                    evalString2 = null;
                }
                if (evalString2 != null) {
                    obj = new Object(evalString2) { // from class: xyz.block.genie.state.GenieImageSource$Resource
                        public final String name;

                        {
                            this.name = evalString2;
                        }

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            return (obj2 instanceof GenieImageSource$Resource) && this.name.equals(((GenieImageSource$Resource) obj2).name);
                        }

                        public final int hashCode() {
                            return this.name.hashCode();
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Resource(name=", this.name, ")");
                        }
                    };
                    if (obj != null) {
                        gapComposer.startReplaceGroup(1045262722);
                    } else {
                        gapComposer.startReplaceGroup(1045262723);
                        gapComposer.startReplaceGroup(2086754462);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                    gapComposer.startReplaceGroup(1045492247);
                    color = resolvedStyle.tint;
                    if (color == null) {
                        color = resolvedStyle.contentColor;
                    }
                    if (color != null) {
                        gapComposer.startReplaceGroup(-1351745006);
                        j = ((ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme)).surfaceVariant;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1351746928);
                        gapComposer.end(false);
                        j = color.value;
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(modifier, j, ColorKt.RectangleShape), gapComposer, 0);
                    gapComposer.end(false);
                }
            }
            ComposePlatform.Image.ImageURL imageURL = image.url;
            if (imageURL != null) {
                Expression expression = imageURL.light;
                if (isSystemInDarkTheme) {
                    evalString = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, imageURL.dark);
                    if (evalString == null) {
                        evalString = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, expression);
                    }
                } else {
                    evalString = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, expression);
                }
                if (evalString != null) {
                    if (evalString.length() <= 0) {
                        evalString = null;
                    }
                    if (evalString != null) {
                        obj = new Object(evalString) { // from class: xyz.block.genie.state.GenieImageSource$Url
                            public final String url;

                            {
                                this.url = evalString;
                            }

                            public final boolean equals(Object obj2) {
                                if (this == obj2) {
                                    return true;
                                }
                                return (obj2 instanceof GenieImageSource$Url) && this.url.equals(((GenieImageSource$Url) obj2).url);
                            }

                            public final int hashCode() {
                                return this.url.hashCode();
                            }

                            public final String toString() {
                                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(url=", this.url, ")");
                            }
                        };
                    }
                }
            }
            if (obj != null) {
            }
            gapComposer.end(false);
            gapComposer.startReplaceGroup(1045492247);
            color = resolvedStyle.tint;
            if (color == null) {
            }
            if (color != null) {
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(modifier, j, ColorKt.RectangleShape), gapComposer, 0);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(image, resolvedStyle, modifier, i, 5);
        }
    }

    public static final ElementBoundsRegistry.Element access$toElementBoundsRegistryElement(TooltipAppMessageViewModel.Ready.Placement placement) {
        switch (placement.ordinal()) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
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
                a$$ExternalSyntheticBUOutline0.m$1("MoneybotSavedToMemoryLabel tooltip should not be rendered via TooltipAppMessageView");
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                break;
        }
        return null;
    }

    public static final boolean containsVideoCapture(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase != null && isVideoCapture(useCase)) {
                return true;
            }
        }
        return false;
    }

    public static final VideoStabilization getVideoStabilization(ArrayList arrayList, Function1 function1) {
        CueEncoder cueEncoder = VideoStabilization.Companion;
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int previewStabilizationMode = ((UseCaseConfig) function1.invoke((UseCase) it.next())).getPreviewStabilizationMode();
            if (previewStabilizationMode != 0) {
                if (i2 != previewStabilizationMode && i2 != 0) {
                    StringUtilsKt.w("UseCaseUtil", Recorder$$ExternalSyntheticOutline2.m(i2, previewStabilizationMode, "Unexpected configurations: Overwriting current previewStabilizationMode(", ") with useCasePreviewStabilization(", ")!"));
                }
                i2 = previewStabilizationMode;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int videoStabilizationMode = ((UseCaseConfig) function1.invoke((UseCase) it2.next())).getVideoStabilizationMode();
            if (videoStabilizationMode != 0) {
                if (i != videoStabilizationMode && i != 0) {
                    StringUtilsKt.w("UseCaseUtil", Recorder$$ExternalSyntheticOutline2.m(i, videoStabilizationMode, "Unexpected configurations: Overwriting current videoStabilizationMode(", ") with useCaseVideoStabilization(", ")!"));
                }
                i = videoStabilizationMode;
            }
        }
        cueEncoder.getClass();
        return (i2 == 1 || i == 1) ? VideoStabilization.OFF : i2 == 2 ? VideoStabilization.PREVIEW : i == 2 ? VideoStabilization.ON : VideoStabilization.UNSPECIFIED;
    }

    public static final boolean isVideoCapture(UseCase useCase) {
        useCase.getClass();
        if (useCase.mCurrentConfig.containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
            return useCase.mCurrentConfig.getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
        }
        StringUtilsKt.e("UseCaseUtil", useCase + " UseCase does not have capture type.");
        return false;
    }
}
