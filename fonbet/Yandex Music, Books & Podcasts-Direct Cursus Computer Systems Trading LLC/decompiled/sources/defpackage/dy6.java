package defpackage;

import com.yandex.music.shared.network.repositories.retrofit.CustomWaveParamsApi;
import com.yandex.music.shared.network.repositories.retrofit.CustomWaveParamsDto;

/* loaded from: classes4.dex */
public final class dy6 {
    public final CustomWaveParamsApi a;
    public final by6 b;

    public dy6(e0j e0jVar) {
        this.a = (CustomWaveParamsApi) e0jVar.a.b(CustomWaveParamsApi.class);
        this.b = (by6) ((rci) e0jVar.c.getValue()).a(ern.a(by6.class), by6.g);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:26|27))(3:28|29|(1:31))|11|(3:13|14|(1:23)(2:16|(2:18|19)(2:21|22)))(4:24|25|14|(0)(0))))|52|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r0 = new defpackage.oj6(r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r0 = r0.b;
        r1 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r9 = r0.c;
        r11 = new defpackage.kj6(r0.a, r0.getDetails(), r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:
    
        r0 = new defpackage.lj6(r0.a, r0.b, r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0028, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005c, code lost:
    
        r0 = new defpackage.oj6(defpackage.btf.b(new defpackage.ur(11, r0)));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: IOException -> 0x0028, IllegalRequestOnNetworkModeException -> 0x002b, MusicCommonHttpException -> 0x002e, MusicBackendHttpException -> 0x0031, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002b, MusicBackendHttpException -> 0x0031, MusicCommonHttpException -> 0x002e, IOException -> 0x0028, blocks: (B:10:0x0024, B:11:0x004b, B:13:0x004f, B:24:0x0055, B:29:0x003e), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: IOException -> 0x0028, IllegalRequestOnNetworkModeException -> 0x002b, MusicCommonHttpException -> 0x002e, MusicBackendHttpException -> 0x0031, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002b, MusicBackendHttpException -> 0x0031, MusicCommonHttpException -> 0x002e, IOException -> 0x0028, blocks: (B:10:0x0024, B:11:0x004b, B:13:0x004f, B:24:0x0055, B:29:0x003e), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        cy6 cy6Var;
        int i;
        Object kj6Var;
        CustomWaveParamsDto customWaveParamsDto;
        if (cg6Var instanceof cy6) {
            cy6Var = (cy6) cg6Var;
            int i2 = cy6Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cy6Var.l = i2 - Integer.MIN_VALUE;
                Object obj = cy6Var.j;
                nm6 nm6Var = nm6.a;
                i = cy6Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    by6 by6Var = this.b;
                    CustomWaveParamsApi customWaveParamsApi = this.a;
                    cy6Var.l = 1;
                    obj = by6Var.A(customWaveParamsApi, cy6Var);
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
                customWaveParamsDto = (CustomWaveParamsDto) obj;
                if (customWaveParamsDto != null) {
                    kj6Var = new nj6(null);
                    if (!(kj6Var instanceof pj6)) {
                        return null;
                    }
                    if (!(kj6Var instanceof qj6)) {
                        b6e.s();
                        return null;
                    }
                    CustomWaveParamsDto customWaveParamsDto2 = (CustomWaveParamsDto) ((qj6) kj6Var).a;
                    customWaveParamsDto2.getClass();
                    return new amu(customWaveParamsDto2.getDefaultBgImageUrl(), customWaveParamsDto2.getSquareAgentAnimation(), customWaveParamsDto2.getCircleAgentAnimation());
                }
                Object oj6Var = new qj6(customWaveParamsDto);
                kj6Var = oj6Var;
                if (!(kj6Var instanceof pj6)) {
                }
            }
        }
        cy6Var = new cy6(this, cg6Var);
        Object obj2 = cy6Var.j;
        nm6 nm6Var2 = nm6.a;
        i = cy6Var.l;
        if (i != 0) {
        }
        customWaveParamsDto = (CustomWaveParamsDto) obj2;
        if (customWaveParamsDto != null) {
        }
    }
}
