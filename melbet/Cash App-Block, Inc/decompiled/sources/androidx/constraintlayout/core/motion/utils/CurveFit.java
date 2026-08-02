package androidx.constraintlayout.core.motion.utils;

import com.google.android.gms.internal.mlkit_common.zzsr;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.registrar.api.StatementCoverage$Type$Annual;
import com.squareup.protos.cash.registrar.api.StatementCoverage$Type$Monthly;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class CurveFit {
    public static zzsr zza;

    public static CurveFit get(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new MonotonicCurveFit(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            Constant constant = new Constant();
            constant.mTime = d;
            constant.mValue = dArr3;
            return constant;
        }
        LinearCurveFit linearCurveFit = new LinearCurveFit();
        int length = dArr2[0].length;
        linearCurveFit.mSlopeTemp = new double[length];
        linearCurveFit.mT = dArr;
        linearCurveFit.mY = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return linearCurveFit;
    }

    public static final StatementCoverage.Annual getAnnual(zzko zzkoVar) {
        StatementCoverage$Type$Annual statementCoverage$Type$Annual = zzkoVar instanceof StatementCoverage$Type$Annual ? (StatementCoverage$Type$Annual) zzkoVar : null;
        if (statementCoverage$Type$Annual != null) {
            return statementCoverage$Type$Annual.value;
        }
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewCancelPendingSingleUsePayment.deepLinkSpecs;
    }

    public static final StatementCoverage.Monthly getMonthly(zzko zzkoVar) {
        StatementCoverage$Type$Monthly statementCoverage$Type$Monthly = zzkoVar instanceof StatementCoverage$Type$Monthly ? (StatementCoverage$Type$Monthly) zzkoVar : null;
        if (statementCoverage$Type$Monthly != null) {
            return statementCoverage$Type$Monthly.value;
        }
        return null;
    }

    public abstract double getPos(double d);

    public abstract void getPos(double d, double[] dArr);

    public abstract void getPos(double d, float[] fArr);

    public abstract void getSlope(double d, double[] dArr);

    public abstract double[] getTimePoints();

    public final class Constant extends CurveFit {
        public double mTime;
        public double[] mValue;

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void getPos(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.mValue;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void getSlope(double d, double[] dArr) {
            for (int i = 0; i < this.mValue.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double[] getTimePoints() {
            return new double[]{this.mTime};
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void getPos(double d, double[] dArr) {
            double[] dArr2 = this.mValue;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double getPos(double d) {
            return this.mValue[0];
        }
    }
}
