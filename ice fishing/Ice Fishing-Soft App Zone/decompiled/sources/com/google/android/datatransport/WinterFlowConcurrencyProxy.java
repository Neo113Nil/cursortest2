package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyProxy {
    public final WinterFlowSerializerEncryption[] WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final WinterFlowParserProcessor WinterFlowHookDataSource;
    public final float[] WinterFlowRouterRouter;
    public final boolean WinterFlowRouterStructure;
    public final float[] WinterFlowTransactionManagerStrategy;
    public final float[] WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public WinterFlowConcurrencyProxy(boolean z, WinterFlowParserProcessor winterFlowParserProcessor) {
        int i;
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = winterFlowParserProcessor;
        if (z && winterFlowParserProcessor.equals(WinterFlowParserProcessor.WinterFlowVariableVersionControl)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = winterFlowParserProcessor.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                throw null;
            }
            i = 2;
        }
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = new WinterFlowSerializerEncryption[20];
        this.WinterFlowTransactionManagerStrategy = new float[20];
        this.WinterFlowUnitTestResponse = new float[20];
        this.WinterFlowRouterRouter = new float[3];
    }

    public final float WinterFlowHookDataSource(float f) {
        WinterFlowParserProcessor winterFlowParserProcessor;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            WinterFlowViewUtility.WinterFlowHookDataSource("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.WinterFlowVariableVersionControl;
        WinterFlowSerializerEncryption[] winterFlowSerializerEncryptionArr = this.WinterFlowArrayNetwork;
        WinterFlowSerializerEncryption winterFlowSerializerEncryption = winterFlowSerializerEncryptionArr[i2];
        if (winterFlowSerializerEncryption == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            WinterFlowSerializerEncryption winterFlowSerializerEncryption2 = winterFlowSerializerEncryption;
            while (true) {
                WinterFlowSerializerEncryption winterFlowSerializerEncryption3 = winterFlowSerializerEncryptionArr[i2];
                boolean z2 = this.WinterFlowRouterStructure;
                winterFlowParserProcessor = this.WinterFlowHookDataSource;
                fArr = this.WinterFlowTransactionManagerStrategy;
                fArr2 = this.WinterFlowUnitTestResponse;
                if (winterFlowSerializerEncryption3 != null) {
                    long j = winterFlowSerializerEncryption.WinterFlowRouterStructure;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = winterFlowSerializerEncryption3.WinterFlowRouterStructure;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - winterFlowSerializerEncryption2.WinterFlowRouterStructure);
                    winterFlowSerializerEncryption2 = (winterFlowParserProcessor == WinterFlowParserProcessor.WinterFlowVariableVersionControl || z) ? winterFlowSerializerEncryption3 : winterFlowSerializerEncryption;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = winterFlowSerializerEncryption3.WinterFlowHookDataSource;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.WinterFlowCacheManagerAgent) {
                int ordinal = winterFlowParserProcessor.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.WinterFlowRouterRouter;
                        WinterFlowDecoratorUI.WinterFlowResolverController(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public final void WinterFlowRouterStructure(long j, float f) {
        int i = (this.WinterFlowVariableVersionControl + 1) % 20;
        this.WinterFlowVariableVersionControl = i;
        WinterFlowSerializerEncryption[] winterFlowSerializerEncryptionArr = this.WinterFlowArrayNetwork;
        WinterFlowSerializerEncryption winterFlowSerializerEncryption = winterFlowSerializerEncryptionArr[i];
        if (winterFlowSerializerEncryption != null) {
            winterFlowSerializerEncryption.WinterFlowRouterStructure = j;
            winterFlowSerializerEncryption.WinterFlowHookDataSource = f;
        } else {
            WinterFlowSerializerEncryption winterFlowSerializerEncryption2 = new WinterFlowSerializerEncryption();
            winterFlowSerializerEncryption2.WinterFlowRouterStructure = j;
            winterFlowSerializerEncryption2.WinterFlowHookDataSource = f;
            winterFlowSerializerEncryptionArr[i] = winterFlowSerializerEncryption2;
        }
    }

    public /* synthetic */ WinterFlowConcurrencyProxy() {
        this(false, WinterFlowParserProcessor.WinterFlowVariableVersionControl);
    }

    public WinterFlowConcurrencyProxy(int i) {
        this(true, WinterFlowParserProcessor.WinterFlowTransactionManagerStrategy);
    }
}
