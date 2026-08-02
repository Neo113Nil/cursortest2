package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wizard.entry.data.WizardMonolithApi;
import com.yandex.music.shared.wizard.entry.data.dto.WizardEntryBlockDto;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class gvv {
    public final arf a;

    public gvv(wuv wuvVar) {
        this.a = wuvVar.b(hag.I(WizardMonolithApi.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, List list) {
        evv evvVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof evv) {
            evvVar = (evv) cg6Var;
            int i2 = evvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                evvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = evvVar.j;
                nm6 nm6Var = nm6.a;
                i = evvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WizardEntryBlockDto>> wizardEntryBlock = ((WizardMonolithApi) this.a.getValue()).getWizardEntryBlock(new o3f(list), str);
                    evvVar.l = 1;
                    obj = swf.N(wizardEntryBlock, evvVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    juv H = ocg.H((WizardEntryBlockDto) ((aii) biiVar).a);
                    return H == null ? new nj6(null) : new qj6(H);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
                }
                if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                }
                if (biiVar instanceof zhi) {
                    return uwf.J((zhi) biiVar);
                }
                b6e.s();
                return null;
            }
        }
        evvVar = new evv(this, cg6Var);
        Object obj2 = evvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = evvVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, List list, b80 b80Var, String str2, cg6 cg6Var) {
        fvv fvvVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof fvv) {
            fvvVar = (fvv) cg6Var;
            int i2 = fvvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fvvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fvvVar.j;
                nm6 nm6Var = nm6.a;
                i = fvvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WizardEntryBlockDto>> wizardEntryBlock = ((WizardMonolithApi) this.a.getValue()).getWizardEntryBlock(str, new o3f(list), b80Var, str2);
                    fvvVar.l = 1;
                    obj = swf.N(wizardEntryBlock, fvvVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    juv H = ocg.H((WizardEntryBlockDto) ((aii) biiVar).a);
                    return H == null ? new nj6(null) : new qj6(H);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
                }
                if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                }
                if (biiVar instanceof zhi) {
                    return uwf.J((zhi) biiVar);
                }
                b6e.s();
                return null;
            }
        }
        fvvVar = new fvv(this, cg6Var);
        Object obj2 = fvvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fvvVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
