package defpackage;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class m4r implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4r b;

    public /* synthetic */ m4r(p4r p4rVar, int i) {
        this.a = i;
        this.b = p4rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                p4r p4rVar = this.b;
                p4rVar.p = ((Float) obj).floatValue();
                GLES20.glUniform1f(p4rVar.E, p4rVar.p);
                break;
            case 1:
                p4r p4rVar2 = this.b;
                p4rVar2.q = ((Float) obj).floatValue();
                GLES20.glUniform1f(p4rVar2.F, p4rVar2.q);
                break;
            case 2:
                p4r p4rVar3 = this.b;
                float floatValue = ((Float) obj).floatValue();
                float[] fArr = p4rVar3.B;
                fArr[2] = floatValue;
                GLES20.glUniform1fv(p4rVar3.O, 3, fArr, 0);
                break;
            case 3:
                p4r p4rVar4 = this.b;
                float floatValue2 = ((Float) obj).floatValue();
                float[] fArr2 = p4rVar4.B;
                fArr2[1] = floatValue2;
                GLES20.glUniform1fv(p4rVar4.O, 3, fArr2, 0);
                break;
            case 4:
                p4r p4rVar5 = this.b;
                float floatValue3 = ((Float) obj).floatValue();
                float[] fArr3 = p4rVar5.B;
                fArr3[0] = floatValue3;
                GLES20.glUniform1fv(p4rVar5.O, 3, fArr3, 0);
                break;
            case 5:
                p4r p4rVar6 = this.b;
                float floatValue4 = ((Float) obj).floatValue();
                p4rVar6.x = floatValue4;
                GLES20.glUniform1f(p4rVar6.Q, floatValue4);
                break;
            default:
                p4r p4rVar7 = this.b;
                float floatValue5 = ((Float) obj).floatValue();
                p4rVar7.x = floatValue5;
                GLES20.glUniform1f(p4rVar7.Q, floatValue5);
                break;
        }
        return Unit.a;
    }
}
