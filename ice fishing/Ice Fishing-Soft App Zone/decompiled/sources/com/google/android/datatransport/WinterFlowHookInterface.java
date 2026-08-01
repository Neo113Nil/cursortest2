package com.google.android.datatransport;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHookInterface implements WinterFlowJavaLayer {
    public Rect WinterFlowCacheManagerAgent;
    public Rect WinterFlowHookDataSource;
    public Canvas WinterFlowRouterStructure = WinterFlowBandwidthListener.WinterFlowRouterStructure;

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowArrayNetwork(WinterFlowSoftwareUserManager winterFlowSoftwareUserManager, long j, long j2, long j3, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        if (this.WinterFlowHookDataSource == null) {
            this.WinterFlowHookDataSource = new Rect();
            this.WinterFlowCacheManagerAgent = new Rect();
        }
        Canvas canvas = this.WinterFlowRouterStructure;
        if (!(winterFlowSoftwareUserManager instanceof WinterFlowSoftwareUserManager)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = winterFlowSoftwareUserManager.WinterFlowRouterStructure;
        Rect rect = this.WinterFlowHookDataSource;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.WinterFlowCacheManagerAgent;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowBandwidthObject(long j, long j2, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        this.WinterFlowRouterStructure.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowCacheManagerAgent(float f, float f2) {
        this.WinterFlowRouterStructure.scale(f, f2);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowHookDataSource(WinterFlowManagerCloud winterFlowManagerCloud) {
        Canvas canvas = this.WinterFlowRouterStructure;
        if (!(winterFlowManagerCloud instanceof WinterFlowManagerCloud)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(winterFlowManagerCloud.WinterFlowRouterStructure, Region.Op.INTERSECT);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowOrchestrationSubsystem(WinterFlowManagerCloud winterFlowManagerCloud, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        Canvas canvas = this.WinterFlowRouterStructure;
        if (!(winterFlowManagerCloud instanceof WinterFlowManagerCloud)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(winterFlowManagerCloud.WinterFlowRouterStructure, (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowResponseEngine() {
        this.WinterFlowRouterStructure.restore();
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowRouterRouter(float f, float f2) {
        this.WinterFlowRouterStructure.translate(f, f2);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowRouterStructure(WinterFlowVersionParser winterFlowVersionParser, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        this.WinterFlowRouterStructure.saveLayer(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork, (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource, 31);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowServerProtocol() {
        WinterFlowSoftwareException.WinterFlowCompilerVariable(this.WinterFlowRouterStructure, false);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowServiceUtility() {
        WinterFlowSoftwareException.WinterFlowCompilerVariable(this.WinterFlowRouterStructure, true);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowSyntax(float f, float f2, float f3, float f4, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        this.WinterFlowRouterStructure.drawRect(f, f2, f3, f4, WinterFlowServerManager.WinterFlowVariableBandwidth(winterFlowProtocolPlatform));
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowThreadListener(float[] fArr) {
        if (WinterFlowInvokerComponent.WinterFlowSoftwareEngine(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.WinterFlowRouterStructure.concat(matrix);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowTransactionAgent() {
        this.WinterFlowRouterStructure.save();
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowTransactionManagerStrategy(float f, long j, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        this.WinterFlowRouterStructure.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowUnitTestResponse(float f, float f2, float f3, float f4, int i) {
        this.WinterFlowRouterStructure.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // com.google.android.datatransport.WinterFlowJavaLayer
    public final void WinterFlowVariableVersionControl(float f, float f2, float f3, float f4, float f5, float f6, WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        this.WinterFlowRouterStructure.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource);
    }
}
