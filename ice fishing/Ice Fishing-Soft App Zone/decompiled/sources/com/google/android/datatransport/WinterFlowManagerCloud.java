package com.google.android.datatransport;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerCloud {
    public float[] WinterFlowCacheManagerAgent;
    public RectF WinterFlowHookDataSource;
    public final Path WinterFlowRouterStructure;

    public WinterFlowManagerCloud(Path path) {
        this.WinterFlowRouterStructure = path;
    }

    public static void WinterFlowHookDataSource(WinterFlowManagerCloud winterFlowManagerCloud, WinterFlowQueryJSON winterFlowQueryJSON) {
        RectF rectF = winterFlowManagerCloud.WinterFlowHookDataSource;
        if (rectF == null) {
            rectF = new RectF();
            winterFlowManagerCloud.WinterFlowHookDataSource = rectF;
        }
        float f = winterFlowQueryJSON.WinterFlowRouterStructure;
        long j = winterFlowQueryJSON.WinterFlowRouterRouter;
        long j2 = winterFlowQueryJSON.WinterFlowUnitTestResponse;
        long j3 = winterFlowQueryJSON.WinterFlowTransactionManagerStrategy;
        long j4 = winterFlowQueryJSON.WinterFlowVariableVersionControl;
        rectF.set(f, winterFlowQueryJSON.WinterFlowHookDataSource, winterFlowQueryJSON.WinterFlowCacheManagerAgent, winterFlowQueryJSON.WinterFlowArrayNetwork);
        float[] fArr = winterFlowManagerCloud.WinterFlowCacheManagerAgent;
        if (fArr == null) {
            fArr = new float[8];
            winterFlowManagerCloud.WinterFlowCacheManagerAgent = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = winterFlowManagerCloud.WinterFlowRouterStructure;
        RectF rectF2 = winterFlowManagerCloud.WinterFlowHookDataSource;
        rectF2.getClass();
        float[] fArr2 = winterFlowManagerCloud.WinterFlowCacheManagerAgent;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static void WinterFlowRouterStructure(WinterFlowManagerCloud winterFlowManagerCloud, WinterFlowManagerCloud winterFlowManagerCloud2) {
        winterFlowManagerCloud.WinterFlowRouterStructure.addPath(winterFlowManagerCloud2.WinterFlowRouterStructure, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public final boolean WinterFlowArrayNetwork(WinterFlowManagerCloud winterFlowManagerCloud, WinterFlowManagerCloud winterFlowManagerCloud2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(winterFlowManagerCloud instanceof WinterFlowManagerCloud)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = winterFlowManagerCloud.WinterFlowRouterStructure;
        if (winterFlowManagerCloud2 instanceof WinterFlowManagerCloud) {
            return this.WinterFlowRouterStructure.op(path, winterFlowManagerCloud2.WinterFlowRouterStructure, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final WinterFlowVersionParser WinterFlowCacheManagerAgent() {
        RectF rectF = this.WinterFlowHookDataSource;
        if (rectF == null) {
            rectF = new RectF();
            this.WinterFlowHookDataSource = rectF;
        }
        this.WinterFlowRouterStructure.computeBounds(rectF, true);
        return new WinterFlowVersionParser(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void WinterFlowVariableVersionControl() {
        this.WinterFlowRouterStructure.reset();
    }
}
