package defpackage;

import com.yandex.music.shared.player.download2.GetFileInfoException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.plus.bdui.plus.content.i;
import com.yandex.plus.bdui.plus.content.serializer.t0;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class i32 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ i32(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 2);
                wfp.v(jfpVar, this.b ? sls.a : sls.b);
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.r(jfpVar2, this.b);
                wfp.q(jfpVar2, 1);
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.r(jfpVar3, this.b);
                wfp.q(jfpVar3, 4);
                return Unit.a;
            case 3:
                InternalDownloadException internalDownloadException = (InternalDownloadException) obj;
                zao zaoVar = zao.b;
                zao zaoVar2 = zao.a;
                internalDownloadException.getClass();
                if (internalDownloadException instanceof GetFileInfoException) {
                    return zaoVar;
                }
                if ((internalDownloadException instanceof qte) || (internalDownloadException instanceof rte)) {
                    return new ebo();
                }
                if (internalDownloadException instanceof vte) {
                    return this.b ? new fbo(false, zaoVar2) : zaoVar;
                }
                if (internalDownloadException instanceof bue) {
                    return new ebo();
                }
                if ((internalDownloadException instanceof yte) || (internalDownloadException instanceof wte) || (internalDownloadException instanceof due)) {
                    return new kbo(30000L, new ebo());
                }
                if (internalDownloadException instanceof xte) {
                    return new ibo(ern.a(xte.class), new hcl(28), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar), new Pair(new IntRange(500, 599, 1), new ebo())}, 2), zaoVar);
                }
                if ((internalDownloadException instanceof pte) || (internalDownloadException instanceof ute) || (internalDownloadException instanceof ats) || (internalDownloadException instanceof tte) || (internalDownloadException instanceof aue) || (internalDownloadException instanceof eue) || (internalDownloadException instanceof cue)) {
                    return zaoVar;
                }
                b6e.s();
                return null;
            case 4:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.r(jfpVar4, this.b);
                wfp.q(jfpVar4, 1);
                return Unit.a;
            case 5:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.r(jfpVar5, this.b);
                wfp.q(jfpVar5, 4);
                return Unit.a;
            case 6:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                if (this.b) {
                    wfp.r(jfpVar6, true);
                }
                return Unit.a;
            case 7:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.q(jfpVar7, 2);
                wfp.v(jfpVar7, this.b ? sls.a : sls.b);
                return Unit.a;
            case 8:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.q(jfpVar8, 2);
                wfp.v(jfpVar8, this.b ? sls.a : sls.b);
                return Unit.a;
            case 9:
                jfp jfpVar9 = (jfp) obj;
                jfpVar9.getClass();
                if (!this.b) {
                    wfp.c(jfpVar9);
                }
                return Unit.a;
            case 10:
                jfp jfpVar10 = (jfp) obj;
                jfpVar10.getClass();
                if (!this.b) {
                    wfp.c(jfpVar10);
                }
                return Unit.a;
            case 11:
                jfp jfpVar11 = (jfp) obj;
                jfpVar11.getClass();
                wfp.r(jfpVar11, this.b);
                wfp.q(jfpVar11, 4);
                return Unit.a;
            case 12:
                jfp jfpVar12 = (jfp) obj;
                jfpVar12.getClass();
                wfp.q(jfpVar12, 4);
                wfp.r(jfpVar12, this.b);
                return Unit.a;
            case 13:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                if (this.b) {
                    jpa.A0(opfVar, (ai3) ycu.a.getValue(), 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.a;
            case 14:
                jfp jfpVar13 = (jfp) obj;
                jfpVar13.getClass();
                wfp.r(jfpVar13, this.b);
                return Unit.a;
            default:
                i iVar = (i) obj;
                iVar.getClass();
                t0 t0Var = (t0) iVar;
                return this.b ? t0Var.c.d : t0Var.c.e;
        }
    }
}
