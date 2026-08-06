package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qh1 extends d71 implements lv {
    public final /* synthetic */ ContentResolver E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ Context WIEu4Ya2g8;
    public final /* synthetic */ Uri XnEVoBF0td1l;
    public final /* synthetic */ n8 iwATDS1i01k;
    public m8 mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;
    public final /* synthetic */ rh1 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh1(ContentResolver contentResolver, Uri uri, rh1 rh1Var, n8 n8Var, Context context, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = contentResolver;
        this.XnEVoBF0td1l = uri;
        this.uFEq9NpZ = rh1Var;
        this.iwATDS1i01k = n8Var;
        this.WIEu4Ya2g8 = context;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((qh1) uFEq9NpZ((vg) obj2, (ms) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.E7jCp8Ls(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        ms msVar;
        m8 m8Var;
        ms msVar2;
        m8 m8Var2;
        Object Yi7zF1RB1;
        int i = this.JFJ3QoxA;
        rh1 rh1Var = this.uFEq9NpZ;
        ContentResolver contentResolver = this.E7jCp8Ls;
        qh qhVar = qh.OOA6hdeuvCS;
        try {
            if (i == 0) {
                o50.A1EKNP6CxJ(obj);
                msVar = (ms) this.rQPn8YBR;
                contentResolver.registerContentObserver(this.XnEVoBF0td1l, false, rh1Var);
                m8Var = new m8(this.iwATDS1i01k);
                this.rQPn8YBR = msVar;
                this.mOu10nynGul = m8Var;
                this.JFJ3QoxA = 1;
                Yi7zF1RB1 = m8Var.Yi7zF1RB1(this);
                if (Yi7zF1RB1 != qhVar) {
                }
            } else if (i == 1) {
                m8Var2 = this.mOu10nynGul;
                msVar2 = (ms) this.rQPn8YBR;
                o50.A1EKNP6CxJ(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m8Var2 = this.mOu10nynGul;
                msVar2 = (ms) this.rQPn8YBR;
                o50.A1EKNP6CxJ(obj);
                msVar = msVar2;
                m8Var = m8Var2;
                this.rQPn8YBR = msVar;
                this.mOu10nynGul = m8Var;
                this.JFJ3QoxA = 1;
                Yi7zF1RB1 = m8Var.Yi7zF1RB1(this);
                if (Yi7zF1RB1 != qhVar) {
                    return qhVar;
                }
                m8 m8Var3 = m8Var;
                msVar2 = msVar;
                obj = Yi7zF1RB1;
                m8Var2 = m8Var3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(rh1Var);
                    return kc1.GWasM1elztuh;
                }
                m8Var2.X1lG3V04pd();
                Context context = this.WIEu4Ya2g8;
                hg0 hg0Var = sh1.GWasM1elztuh;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.rQPn8YBR = msVar2;
                this.mOu10nynGul = m8Var2;
                this.JFJ3QoxA = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(rh1Var);
            throw th;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        qh1 qh1Var = new qh1(this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, this.iwATDS1i01k, this.WIEu4Ya2g8, vgVar);
        qh1Var.rQPn8YBR = obj;
        return qh1Var;
    }
}
