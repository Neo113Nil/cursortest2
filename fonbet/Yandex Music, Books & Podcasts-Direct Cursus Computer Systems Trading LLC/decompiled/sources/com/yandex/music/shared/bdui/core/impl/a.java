package com.yandex.music.shared.bdui.core.impl;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.bdui.core.impl.BduiApi;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.fgq;
import defpackage.gy2;
import defpackage.hrg;
import defpackage.hy2;
import defpackage.iy2;
import defpackage.nj6;
import defpackage.nm6;
import defpackage.pj6;
import defpackage.qc9;
import defpackage.qgg;
import defpackage.qj6;
import defpackage.rj6;
import defpackage.rv8;
import defpackage.uwf;
import defpackage.vyo;
import defpackage.wyo;
import defpackage.xq0;
import defpackage.xyo;
import defpackage.z7k;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class a {
    public final Gson a;
    public final BduiApi b;

    public a(Gson gson, BduiApi bduiApi) {
        this.a = gson;
        this.b = bduiApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        hy2 hy2Var;
        int i;
        a aVar;
        if (cg6Var instanceof hy2) {
            hy2Var = (hy2) cg6Var;
            int i2 = hy2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hy2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = hy2Var.k;
                nm6 nm6Var = nm6.a;
                i = hy2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<BduiApi.BduiScreenDto>> b = this.b.b(str);
                    hy2Var.j = this;
                    hy2Var.m = 1;
                    obj = uwf.g(b, hy2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = hy2Var.j;
                    qgg.h0(obj);
                }
                return aVar.c((rj6) obj);
            }
        }
        hy2Var = new hy2(this, cg6Var);
        Object obj2 = hy2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = hy2Var.m;
        if (i != 0) {
        }
        return aVar.c((rj6) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        iy2 iy2Var;
        int i;
        a aVar;
        if (cg6Var instanceof iy2) {
            iy2Var = (iy2) cg6Var;
            int i2 = iy2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iy2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = iy2Var.k;
                nm6 nm6Var = nm6.a;
                i = iy2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<BduiApi.BduiScreenDto>> a = this.b.a(str);
                    iy2Var.j = this;
                    iy2Var.m = 1;
                    obj = uwf.g(a, iy2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = iy2Var.j;
                    qgg.h0(obj);
                }
                return aVar.c((rj6) obj);
            }
        }
        iy2Var = new iy2(this, cg6Var);
        Object obj2 = iy2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = iy2Var.m;
        if (i != 0) {
        }
        return aVar.c((rj6) obj2);
    }

    public final xyo c(rj6 rj6Var) {
        String i;
        if (!(rj6Var instanceof qj6)) {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            String str = "failed to fetch div screen " + rj6Var;
            if (rj6Var instanceof nj6) {
                Assertions.throwOrSkip$default(new FailedAssertionException(str, ((nj6) rj6Var).a()), null, 2, null);
            }
            return new vyo(str, ((pj6) rj6Var).a());
        }
        Object obj = ((qj6) rj6Var).a;
        BduiApi.DivDto div = ((BduiApi.BduiScreenDto) obj).getDiv();
        if (div == null) {
            String n = hrg.n(obj, "missing div data ");
            Assertions.throwOrSkip$default(new FailedAssertionException(n), null, 2, null);
            return new vyo(null, new RuntimeException(n));
        }
        qc9 qc9Var = new qc9(new gy2(0));
        try {
            JsonObject templates = div.getTemplates();
            Gson gson = this.a;
            if (templates != null && (i = gson.i(templates)) != null) {
                qc9Var.e(new JSONObject(i));
            }
            int i2 = rv8.i;
            return new wyo(fgq.y(qc9Var, new JSONObject(gson.i(div.getCard()))));
        } catch (JsonIOException e) {
            Assertions.throwOrSkip$default(new FailedAssertionException("failed to parse div data", e), null, 2, null);
            return new vyo(null, e);
        } catch (JsonSyntaxException e2) {
            Assertions.throwOrSkip$default(new FailedAssertionException("failed to parse div data", e2), null, 2, null);
            return new vyo(null, e2);
        } catch (JSONException e3) {
            Assertions.throwOrSkip$default(new FailedAssertionException("failed to parse div data", e3), null, 2, null);
            return new vyo(null, e3);
        } catch (z7k e4) {
            Assertions.throwOrSkip$default(new FailedAssertionException("failed to parse div data", e4), null, 2, null);
            return new vyo(null, e4);
        }
    }
}
