package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassMechanism implements WinterFlowSingletonProcess {
    public final WinterFlowControllerJSON WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowClassMechanism(float f, float f2) {
        this.WinterFlowRouterStructure = f2;
        WinterFlowControllerJSON winterFlowControllerJSON = new WinterFlowControllerJSON();
        winterFlowControllerJSON.WinterFlowRouterStructure = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        winterFlowControllerJSON.WinterFlowHookDataSource = sqrt;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            WinterFlowInheritanceWorker.WinterFlowRouterStructure("Spring stiffness constant must be positive.");
        }
        winterFlowControllerJSON.WinterFlowHookDataSource = Math.sqrt(f);
        this.WinterFlowHookDataSource = winterFlowControllerJSON;
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final long WinterFlowArrayNetwork(float f, float f2, float f3) {
        long j;
        double d = this.WinterFlowHookDataSource.WinterFlowHookDataSource;
        float f4 = this.WinterFlowRouterStructure;
        float f5 = (f - f2) / f4;
        double d2 = (float) (d * d);
        double d3 = f3 / f4;
        double d4 = f5;
        double sqrt = Math.sqrt(d2) * 2.0d;
        double d5 = (sqrt * sqrt) - (d2 * 4.0d);
        double sqrt2 = d5 < 0.0d ? 0.0d : Math.sqrt(d5);
        if (d5 < 0.0d) {
            Math.sqrt(Math.abs(d5));
        }
        double d6 = ((-sqrt) + sqrt2) * 0.5d;
        if (d4 == 0.0d && d3 == 0.0d) {
            j = 0;
        } else {
            if (d4 < 0.0d) {
                d3 = -d3;
            }
            double abs = Math.abs(d4);
            double d7 = d6 * abs;
            double d8 = d3 - d7;
            double log = Math.log(Math.abs(1.0d / abs)) / d6;
            double log2 = Math.log(Math.abs(1.0d / d8));
            double d9 = log2;
            for (int i = 0; i < 6; i++) {
                d9 = log2 - Math.log(Math.abs(d9 / d6));
            }
            double d10 = d9 / d6;
            if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) >= 9218868437227405312L) {
                log = d10;
            } else if ((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L) {
                log = Math.max(log, d10);
            }
            double d11 = (-(d7 + d8)) / (d6 * d8);
            double d12 = d6 * d11;
            double exp = (Math.exp(d12) * d8 * d11) + (Math.exp(d12) * abs);
            double d13 = -1.0d;
            if (!Double.isNaN(d11) && d11 > 0.0d) {
                if (d11 <= 0.0d || (-exp) >= 1.0d) {
                    log = (-(2.0d / d6)) - (abs / d8);
                    d13 = 1.0d;
                } else if (d8 < 0.0d && abs > 0.0d) {
                    log = 0.0d;
                }
            }
            double d14 = Double.MAX_VALUE;
            int i2 = 0;
            while (d14 > 0.001d && i2 < 100) {
                i2++;
                double d15 = d6 * log;
                double exp2 = log - (((Math.exp(d15) * ((d8 * log) + abs)) + d13) / (Math.exp(d15) * (((d15 + 1.0d) * d8) + d7)));
                d14 = Math.abs(log - exp2);
                log = exp2;
            }
            j = (long) (log * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final float WinterFlowCacheManagerAgent(long j, float f, float f2, float f3) {
        WinterFlowControllerJSON winterFlowControllerJSON = this.WinterFlowHookDataSource;
        winterFlowControllerJSON.WinterFlowRouterStructure = f2;
        return Float.intBitsToFloat((int) (winterFlowControllerJSON.WinterFlowRouterStructure(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final float WinterFlowHookDataSource(long j, float f, float f2, float f3) {
        WinterFlowControllerJSON winterFlowControllerJSON = this.WinterFlowHookDataSource;
        winterFlowControllerJSON.WinterFlowRouterStructure = f2;
        return Float.intBitsToFloat((int) (winterFlowControllerJSON.WinterFlowRouterStructure(f, f3, j / 1000000) >> 32));
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonProcess
    public final float WinterFlowVariableVersionControl(float f, float f2, float f3) {
        return 0.0f;
    }
}
