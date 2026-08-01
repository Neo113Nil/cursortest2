package com.google.android.datatransport;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareValidator {
    public final WinterFlowDeploymentManager WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final WinterFlowRendererEngine WinterFlowRouterStructure;
    public final List WinterFlowTransactionManagerStrategy;
    public final CharSequence WinterFlowVariableVersionControl;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowMiddlewareValidator(WinterFlowRendererEngine winterFlowRendererEngine, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        WinterFlowDeploymentManager WinterFlowRouterStructure;
        int i14;
        WinterFlowMiddlewareValidator winterFlowMiddlewareValidator;
        int i15;
        int i16;
        int i17;
        Layout layout;
        WinterFlowBandwidthUtility[] winterFlowBandwidthUtilityArr;
        CharSequence charSequence;
        List list;
        boolean z;
        int i18;
        CharSequence charSequence2 = winterFlowRendererEngine.WinterFlowServerProtocol;
        this.WinterFlowRouterStructure = winterFlowRendererEngine;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = j;
        if (WinterFlowHandlerConsumer.WinterFlowSyntax(j) != 0 || WinterFlowHandlerConsumer.WinterFlowResponseEngine(j) != 0) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("maxLines should be greater than 0");
        }
        WinterFlowEncryptionServer winterFlowEncryptionServer = winterFlowRendererEngine.WinterFlowTransactionManagerStrategy;
        WinterFlowFrameworkArray winterFlowFrameworkArray = winterFlowEncryptionServer.WinterFlowHookDataSource;
        WinterFlowDebugUtility winterFlowDebugUtility = winterFlowEncryptionServer.WinterFlowRouterStructure;
        if (i2 == 2) {
            i3 = 0;
            if (!WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowRouterRouter, WinterFlowDecoratorUI.WinterFlowBatchUI(0)) && !WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(winterFlowDebugUtility.WinterFlowRouterRouter, WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent) && (i18 = winterFlowFrameworkArray.WinterFlowRouterStructure) != 0 && i18 != 5 && i18 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!WinterFlowNodeVersion.WinterFlowThreadListener(spannable, WinterFlowRequestResolver.class)) {
                    spannable.setSpan(new WinterFlowRequestResolver(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.WinterFlowVariableVersionControl = charSequence3;
        int i19 = winterFlowFrameworkArray.WinterFlowRouterStructure;
        int i20 = i19 == 1 ? 3 : i19 == 2 ? 4 : i19 == 3 ? 2 : (i19 != 5 && i19 == 6) ? 1 : i3;
        int i21 = i19 == 4 ? 1 : i3;
        int i22 = winterFlowFrameworkArray.WinterFlowRouterRouter == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = winterFlowFrameworkArray.WinterFlowUnitTestResponse;
        int i24 = i23 & 255;
        if (i24 != 1) {
            if (i24 == 2) {
                i4 = 1;
            } else if (i24 == 3) {
                i4 = 2;
            }
            i5 = (i23 >> 8) & 255;
            if (i5 != 1) {
                if (i5 == 2) {
                    i6 = i20;
                    i7 = 1;
                } else if (i5 == 3) {
                    i6 = i20;
                    i7 = 2;
                } else if (i5 == 4) {
                    i6 = i20;
                    i7 = 3;
                }
                i8 = (i23 >> 16) & 255;
                if (i8 == 1) {
                    i10 = i4;
                    i11 = i3;
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        i10 = i4;
                        i11 = 1;
                    } else {
                        i10 = i4;
                        i11 = i3;
                    }
                }
                if (i2 == i9) {
                    truncateAt2 = TextUtils.TruncateAt.END;
                } else {
                    if (i2 != 5) {
                        if (i2 == 4) {
                            i12 = i10;
                            i13 = 1;
                            truncateAt = TextUtils.TruncateAt.START;
                        } else {
                            i12 = i10;
                            i13 = 1;
                            truncateAt = null;
                        }
                        WinterFlowRouterStructure = WinterFlowRouterStructure(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
                        Layout layout2 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                        i14 = i6;
                        if (Build.VERSION.SDK_INT < 35 || winterFlowRendererEngine.WinterFlowTransactionAgent.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                            winterFlowMiddlewareValidator = this;
                            i15 = i;
                            i16 = i14;
                            i17 = 2;
                        } else {
                            int ellipsisStart = layout2.getEllipsisStart(0);
                            int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                            CharSequence subSequence = charSequence3.subSequence(0, ellipsisStart);
                            CharSequence subSequence2 = charSequence3.subSequence(ellipsisCount, charSequence3.length());
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = subSequence;
                            charSequenceArr[i13] = "…";
                            i17 = 2;
                            charSequenceArr[2] = subSequence2;
                            winterFlowMiddlewareValidator = this;
                            i15 = i;
                            i16 = i14;
                            WinterFlowRouterStructure = winterFlowMiddlewareValidator.WinterFlowRouterStructure(i16, i21, truncateAt, i15, i22, i12, i7, i11, TextUtils.concat(charSequenceArr));
                        }
                        int i25 = WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
                        if (i2 == i17 || WinterFlowRouterStructure.WinterFlowRouterStructure() <= WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j) || i15 <= i13) {
                            winterFlowMiddlewareValidator.WinterFlowArrayNetwork = WinterFlowRouterStructure;
                        } else {
                            int WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j);
                            int i26 = 0;
                            while (true) {
                                if (i26 >= i25) {
                                    break;
                                }
                                if (WinterFlowRouterStructure.WinterFlowArrayNetwork(i26) > WinterFlowUnitTestResponse) {
                                    i25 = i26;
                                    break;
                                }
                                i26++;
                            }
                            if (i25 >= 0 && i25 != winterFlowMiddlewareValidator.WinterFlowHookDataSource) {
                                WinterFlowRouterStructure = winterFlowMiddlewareValidator.WinterFlowRouterStructure(i16, i21, truncateAt, i25 < 1 ? 1 : i25, i22, i12, i7, i11, winterFlowMiddlewareValidator.WinterFlowVariableVersionControl);
                            }
                            winterFlowMiddlewareValidator.WinterFlowArrayNetwork = WinterFlowRouterStructure;
                        }
                        winterFlowMiddlewareValidator.WinterFlowRouterStructure.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowTransactionAgent(), (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowHookDataSource()) & 4294967295L) | (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowCacheManagerAgent()) << 32), winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowHookDataSource());
                        layout = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                        if (layout.getText() instanceof Spanned) {
                            CharSequence text = layout.getText();
                            text.getClass();
                            Spanned spanned = (Spanned) text;
                            if (spanned.nextSpanTransition(-1, spanned.length(), WinterFlowBandwidthUtility.class) != spanned.length()) {
                                CharSequence text2 = layout.getText();
                                text2.getClass();
                                winterFlowBandwidthUtilityArr = (WinterFlowBandwidthUtility[]) ((Spanned) text2).getSpans(0, layout.getText().length(), WinterFlowBandwidthUtility.class);
                                if (winterFlowBandwidthUtilityArr != null) {
                                    for (WinterFlowBandwidthUtility winterFlowBandwidthUtility : winterFlowBandwidthUtilityArr) {
                                        winterFlowBandwidthUtility.WinterFlowUnitTestResponse.setValue(new WinterFlowModuleBandwidth((Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowHookDataSource()) & 4294967295L) | (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowCacheManagerAgent()) << 32)));
                                    }
                                }
                                charSequence = winterFlowMiddlewareValidator.WinterFlowVariableVersionControl;
                                if (charSequence instanceof Spanned) {
                                    Spanned spanned2 = (Spanned) charSequence;
                                    Object[] spans = spanned2.getSpans(0, charSequence.length(), WinterFlowBackendGateway.class);
                                    ArrayList arrayList = new ArrayList(spans.length);
                                    for (Object obj : spans) {
                                        WinterFlowBackendGateway winterFlowBackendGateway = (WinterFlowBackendGateway) obj;
                                        int spanStart = spanned2.getSpanStart(winterFlowBackendGateway);
                                        int spanEnd = spanned2.getSpanEnd(winterFlowBackendGateway);
                                        int WinterFlowTransactionManagerStrategy = winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy(spanStart);
                                        boolean z2 = WinterFlowTransactionManagerStrategy >= winterFlowMiddlewareValidator.WinterFlowHookDataSource;
                                        if (winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.getEllipsisCount(WinterFlowTransactionManagerStrategy) > 0) {
                                            if (spanEnd > winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.getEllipsisStart(WinterFlowTransactionManagerStrategy) + winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.getLineStart(WinterFlowTransactionManagerStrategy)) {
                                                z = true;
                                                boolean z3 = spanEnd <= winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl(WinterFlowTransactionManagerStrategy);
                                                if (z && !z3 && !z2) {
                                                    boolean z4 = winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.getParagraphDirection(WinterFlowTransactionManagerStrategy) == 1;
                                                    boolean isRtlCharAt = winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.isRtlCharAt(spanStart);
                                                    if (z4 && !isRtlCharAt) {
                                                        winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowRouterRouter(spanStart, false);
                                                        winterFlowBackendGateway.WinterFlowHookDataSource();
                                                    } else if (z4 && isRtlCharAt) {
                                                        winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowSyntax(spanStart, false);
                                                        winterFlowBackendGateway.WinterFlowHookDataSource();
                                                    } else {
                                                        WinterFlowDeploymentManager winterFlowDeploymentManager = winterFlowMiddlewareValidator.WinterFlowArrayNetwork;
                                                        if (isRtlCharAt) {
                                                            winterFlowDeploymentManager.WinterFlowRouterRouter(spanStart, false);
                                                            winterFlowBackendGateway.WinterFlowHookDataSource();
                                                        } else {
                                                            winterFlowDeploymentManager.WinterFlowSyntax(spanStart, false);
                                                            winterFlowBackendGateway.WinterFlowHookDataSource();
                                                        }
                                                    }
                                                    throw null;
                                                }
                                                arrayList.add(null);
                                            }
                                        }
                                        z = false;
                                        if (spanEnd <= winterFlowMiddlewareValidator.WinterFlowArrayNetwork.WinterFlowVariableVersionControl(WinterFlowTransactionManagerStrategy)) {
                                        }
                                        if (z) {
                                        }
                                        arrayList.add(null);
                                    }
                                    list = arrayList;
                                } else {
                                    list = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
                                }
                                winterFlowMiddlewareValidator.WinterFlowTransactionManagerStrategy = list;
                            }
                        }
                        winterFlowBandwidthUtilityArr = null;
                        if (winterFlowBandwidthUtilityArr != null) {
                        }
                        charSequence = winterFlowMiddlewareValidator.WinterFlowVariableVersionControl;
                        if (charSequence instanceof Spanned) {
                        }
                        winterFlowMiddlewareValidator.WinterFlowTransactionManagerStrategy = list;
                    }
                    truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                }
                i12 = i10;
                i13 = 1;
                truncateAt = truncateAt2;
                WinterFlowRouterStructure = WinterFlowRouterStructure(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
                Layout layout22 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                i14 = i6;
                if (Build.VERSION.SDK_INT < 35) {
                }
                winterFlowMiddlewareValidator = this;
                i15 = i;
                i16 = i14;
                i17 = 2;
                int i252 = WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
                if (i2 == i17) {
                }
                winterFlowMiddlewareValidator.WinterFlowArrayNetwork = WinterFlowRouterStructure;
                winterFlowMiddlewareValidator.WinterFlowRouterStructure.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowTransactionAgent(), (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowHookDataSource()) & 4294967295L) | (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowCacheManagerAgent()) << 32), winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowHookDataSource());
                layout = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                if (layout.getText() instanceof Spanned) {
                }
                winterFlowBandwidthUtilityArr = null;
                if (winterFlowBandwidthUtilityArr != null) {
                }
                charSequence = winterFlowMiddlewareValidator.WinterFlowVariableVersionControl;
                if (charSequence instanceof Spanned) {
                }
                winterFlowMiddlewareValidator.WinterFlowTransactionManagerStrategy = list;
            }
            i6 = i20;
            i7 = i3;
            i8 = (i23 >> 16) & 255;
            if (i8 == 1) {
            }
            if (i2 == i9) {
            }
            i12 = i10;
            i13 = 1;
            truncateAt = truncateAt2;
            WinterFlowRouterStructure = WinterFlowRouterStructure(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
            Layout layout222 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
            i14 = i6;
            if (Build.VERSION.SDK_INT < 35) {
            }
            winterFlowMiddlewareValidator = this;
            i15 = i;
            i16 = i14;
            i17 = 2;
            int i2522 = WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
            if (i2 == i17) {
            }
            winterFlowMiddlewareValidator.WinterFlowArrayNetwork = WinterFlowRouterStructure;
            winterFlowMiddlewareValidator.WinterFlowRouterStructure.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowTransactionAgent(), (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowHookDataSource()) & 4294967295L) | (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowCacheManagerAgent()) << 32), winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowHookDataSource());
            layout = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
            if (layout.getText() instanceof Spanned) {
            }
            winterFlowBandwidthUtilityArr = null;
            if (winterFlowBandwidthUtilityArr != null) {
            }
            charSequence = winterFlowMiddlewareValidator.WinterFlowVariableVersionControl;
            if (charSequence instanceof Spanned) {
            }
            winterFlowMiddlewareValidator.WinterFlowTransactionManagerStrategy = list;
        }
        i4 = i3;
        i5 = (i23 >> 8) & 255;
        if (i5 != 1) {
        }
        i6 = i20;
        i7 = i3;
        i8 = (i23 >> 16) & 255;
        if (i8 == 1) {
        }
        if (i2 == i9) {
        }
        i12 = i10;
        i13 = 1;
        truncateAt = truncateAt2;
        WinterFlowRouterStructure = WinterFlowRouterStructure(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
        Layout layout2222 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
        i14 = i6;
        if (Build.VERSION.SDK_INT < 35) {
        }
        winterFlowMiddlewareValidator = this;
        i15 = i;
        i16 = i14;
        i17 = 2;
        int i25222 = WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
        if (i2 == i17) {
        }
        winterFlowMiddlewareValidator.WinterFlowArrayNetwork = WinterFlowRouterStructure;
        winterFlowMiddlewareValidator.WinterFlowRouterStructure.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent(winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowTransactionAgent(), (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowHookDataSource()) & 4294967295L) | (Float.floatToRawIntBits(winterFlowMiddlewareValidator.WinterFlowCacheManagerAgent()) << 32), winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowHookDataSource());
        layout = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
        if (layout.getText() instanceof Spanned) {
        }
        winterFlowBandwidthUtilityArr = null;
        if (winterFlowBandwidthUtilityArr != null) {
        }
        charSequence = winterFlowMiddlewareValidator.WinterFlowVariableVersionControl;
        if (charSequence instanceof Spanned) {
        }
        winterFlowMiddlewareValidator.WinterFlowTransactionManagerStrategy = list;
    }

    public final void WinterFlowArrayNetwork(WinterFlowJavaLayer winterFlowJavaLayer) {
        Canvas WinterFlowRouterStructure = WinterFlowBandwidthListener.WinterFlowRouterStructure(winterFlowJavaLayer);
        WinterFlowDeploymentManager winterFlowDeploymentManager = this.WinterFlowArrayNetwork;
        if (winterFlowDeploymentManager.WinterFlowArrayNetwork) {
            WinterFlowRouterStructure.save();
            WinterFlowRouterStructure.clipRect(0.0f, 0.0f, WinterFlowCacheManagerAgent(), WinterFlowHookDataSource());
        }
        int i = winterFlowDeploymentManager.WinterFlowUnitTestResponse;
        if (WinterFlowRouterStructure.getClipBounds(winterFlowDeploymentManager.WinterFlowServiceUtility)) {
            if (i != 0) {
                WinterFlowRouterStructure.translate(0.0f, i);
            }
            ThreadLocal threadLocal = WinterFlowSessionProvider.WinterFlowRouterStructure;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new WinterFlowAdapterSubsystem();
                threadLocal.set(obj);
            }
            WinterFlowAdapterSubsystem winterFlowAdapterSubsystem = (WinterFlowAdapterSubsystem) obj;
            winterFlowAdapterSubsystem.WinterFlowRouterStructure = WinterFlowRouterStructure;
            try {
                winterFlowDeploymentManager.WinterFlowVariableVersionControl.draw(winterFlowAdapterSubsystem);
                if (i != 0) {
                    WinterFlowRouterStructure.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                winterFlowAdapterSubsystem.WinterFlowRouterStructure = null;
            }
        }
        if (winterFlowDeploymentManager.WinterFlowArrayNetwork) {
            WinterFlowRouterStructure.restore();
        }
    }

    public final float WinterFlowCacheManagerAgent() {
        return WinterFlowHandlerConsumer.WinterFlowRouterRouter(this.WinterFlowCacheManagerAgent);
    }

    public final float WinterFlowHookDataSource() {
        return this.WinterFlowArrayNetwork.WinterFlowRouterStructure();
    }

    public final WinterFlowDeploymentManager WinterFlowRouterStructure(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        WinterFlowObjectBackend winterFlowObjectBackend;
        float WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent();
        WinterFlowRendererEngine winterFlowRendererEngine = this.WinterFlowRouterStructure;
        WinterFlowRendererTransactionManager winterFlowRendererTransactionManager = winterFlowRendererEngine.WinterFlowTransactionAgent;
        int i8 = winterFlowRendererEngine.WinterFlowOrchestrationSubsystem;
        WinterFlowParserComponent winterFlowParserComponent = winterFlowRendererEngine.WinterFlowThreadListener;
        WinterFlowEncryptionServer winterFlowEncryptionServer = winterFlowRendererEngine.WinterFlowTransactionManagerStrategy;
        WinterFlowServiceUserManager winterFlowServiceUserManager = WinterFlowSoftwareInterface.WinterFlowRouterStructure;
        WinterFlowUnitTestStructure winterFlowUnitTestStructure = winterFlowEncryptionServer.WinterFlowCacheManagerAgent;
        return new WinterFlowDeploymentManager(charSequence, WinterFlowCacheManagerAgent, winterFlowRendererTransactionManager, i, truncateAt, i8, (winterFlowUnitTestStructure == null || (winterFlowObjectBackend = winterFlowUnitTestStructure.WinterFlowRouterStructure) == null) ? false : winterFlowObjectBackend.WinterFlowRouterStructure, i3, i5, i6, i7, i4, i2, winterFlowParserComponent);
    }
}
