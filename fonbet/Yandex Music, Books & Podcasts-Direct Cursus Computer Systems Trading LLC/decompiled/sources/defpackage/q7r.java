package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.splash.screen.cache.mapping.impl.SplashScreenCacheMapperImpl$mapToJsonString$type$1;
import com.yandex.music.shared.splash.screen.network.SplashScreenApi;
import com.yandex.music.shared.splash.screen.network.dto.SplashScreenDataDto;
import com.yandex.music.shared.splash.screen.network.dto.SplashScreenDto;
import com.yandex.music.shared.splash.screen.network.dto.SplashScreenRuleDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class q7r {
    public static final long g;
    public final SplashScreenApi a;
    public final zv8 b;
    public final t6r c;
    public final mm6 d;
    public final jyr e;
    public final xdr f;

    static {
        msa msaVar = nsa.b;
        g = yd5.M(30, ssa.SECONDS);
    }

    public q7r(SplashScreenApi splashScreenApi, jyr jyrVar, zv8 zv8Var, t6r t6rVar) {
        tf6 e = gld.e(dm6.b);
        this.a = splashScreenApi;
        this.b = zv8Var;
        this.c = t6rVar;
        this.d = e;
        this.e = jyrVar;
        this.f = t6rVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q7r q7rVar, Call call, cg6 cg6Var) {
        p7r p7rVar;
        int i;
        int i2;
        bii biiVar;
        Object J;
        xve xveVar;
        rv8 rv8Var;
        rv8 rv8Var2;
        SplashScreenDto splashScreenDto;
        xve xveVar2;
        JsonElement v;
        JsonObject G;
        String i3;
        JsonObject G2;
        String i4;
        xve xveVar3;
        Long timeout;
        xyo xyoVar;
        jyr jyrVar = q7rVar.e;
        t6r t6rVar = q7rVar.c;
        if (cg6Var instanceof p7r) {
            p7rVar = (p7r) cg6Var;
            int i5 = p7rVar.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                p7rVar.p = i5 - Integer.MIN_VALUE;
                Object obj = p7rVar.n;
                nm6 nm6Var = nm6.a;
                i = p7rVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    i2 = 0;
                    p7rVar.m = 0;
                    p7rVar.p = 1;
                    obj = swf.N(call, p7rVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rv8Var2 = p7rVar.l;
                        xve xveVar4 = p7rVar.k;
                        splashScreenDto = p7rVar.j;
                        qgg.h0(obj);
                        xveVar2 = xveVar4;
                        xyoVar = (xyo) obj;
                        if (!(xyoVar instanceof vyo)) {
                            Assertions.throwOrSkip("SplashScreenRepository", new FailedAssertionException("failed to cache splash cause of failed preloading. dto = " + splashScreenDto));
                            t6rVar.b();
                        } else {
                            if (!(xyoVar instanceof wyo)) {
                                b6e.s();
                                return null;
                            }
                            String screenId = splashScreenDto.getScreenId();
                            String jSONObject = rv8Var2.r().toString();
                            jSONObject.getClass();
                            yve yveVar = new yve(screenId, jSONObject, xveVar2, splashScreenDto.getDuration().longValue(), splashScreenDto.getIsVibrationEnabled().booleanValue());
                            t6rVar.getClass();
                            u6r u6rVar = (u6r) t6rVar.e.getValue();
                            u6rVar.getClass();
                            Type type = new SplashScreenCacheMapperImpl$mapToJsonString$type$1().getType();
                            Gson gson = u6rVar.a;
                            StringWriter stringWriter = new StringWriter();
                            try {
                                gson.l(yveVar, type, gson.h(stringWriter));
                                String stringWriter2 = stringWriter.toString();
                                stringWriter2.getClass();
                                x97.y(t6rVar.d, null, null, new v0r(t6rVar, stringWriter2, null, 5), 3);
                            } catch (IOException e) {
                                throw new JsonIOException(e);
                            }
                        }
                        J = new qj6(Unit.a);
                        if ((J instanceof lj6) && ((lj6) J).a == 204) {
                            t6rVar.b();
                        }
                        return Unit.a;
                    }
                    i2 = p7rVar.m;
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i6 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        J = new kj6(i6, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                    } else if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    } else {
                        if (!(biiVar instanceof zhi)) {
                            b6e.s();
                            return null;
                        }
                        J = uwf.J((zhi) biiVar);
                    }
                    if (J instanceof lj6) {
                    }
                    return Unit.a;
                }
                SplashScreenDto splashScreenDto2 = (SplashScreenDto) ((aii) biiVar).a;
                if (splashScreenDto2.getScreenId() != null) {
                    SplashScreenDataDto data = splashScreenDto2.getData();
                    if ((data != null ? data.getDiv() : null) != null && splashScreenDto2.getRule() != null && splashScreenDto2.getDuration() != null && splashScreenDto2.getIsVibrationEnabled() != null) {
                        n7r n7rVar = (n7r) jyrVar.getValue();
                        SplashScreenRuleDto rule = splashScreenDto2.getRule();
                        n7rVar.getClass();
                        rule.getClass();
                        String type2 = rule.getType();
                        if (type2 != null) {
                            int hashCode = type2.hashCode();
                            if (hashCode != -1414557169) {
                                if (hashCode != -1313911455) {
                                    if (hashCode == 95346201 && type2.equals("daily")) {
                                        xveVar3 = vve.a;
                                        xveVar = xveVar3;
                                    }
                                } else if (type2.equals("timeout") && (timeout = rule.getTimeout()) != null) {
                                    xveVar3 = new wve(timeout.longValue());
                                    xveVar = xveVar3;
                                }
                            } else if (type2.equals("always")) {
                                xveVar3 = uve.a;
                                xveVar = xveVar3;
                            }
                            if (xveVar != null) {
                                Assertions.throwOrSkip("SplashScreenRepository", new FailedAssertionException("failed to cache splash cause of invalid rule. dto = " + splashScreenDto2));
                                t6rVar.b();
                                return Unit.a;
                            }
                            n7r n7rVar2 = (n7r) jyrVar.getValue();
                            JsonObject div = splashScreenDto2.getData().getDiv();
                            Gson gson2 = n7rVar2.a;
                            div.getClass();
                            qc9 qc9Var = new qc9(new gy2(6));
                            try {
                                JsonElement v2 = div.v("templates");
                                if (v2 != null && (G2 = cxb.G(v2)) != null && (i4 = gson2.i(G2)) != null) {
                                    qc9Var.e(new JSONObject(i4));
                                }
                                v = div.v("card");
                            } catch (JsonIOException e2) {
                                Assertions.throwOrSkip("SplashScreenNetworkMapper", new FailedAssertionException("failed to parse div data", e2));
                            } catch (JsonSyntaxException e3) {
                                Assertions.throwOrSkip("SplashScreenNetworkMapper", new FailedAssertionException("failed to parse div data", e3));
                            } catch (JSONException e4) {
                                Assertions.throwOrSkip("SplashScreenNetworkMapper", new FailedAssertionException("failed to parse div data", e4));
                            } catch (z7k e5) {
                                Assertions.throwOrSkip("SplashScreenNetworkMapper", new FailedAssertionException("failed to parse div data", e5));
                            }
                            if (v != null && (G = cxb.G(v)) != null && (i3 = gson2.i(G)) != null) {
                                JSONObject jSONObject2 = new JSONObject(i3);
                                int i7 = rv8.i;
                                rv8Var = fgq.y(qc9Var, jSONObject2);
                                if (rv8Var != null) {
                                    Assertions.throwOrSkip("SplashScreenRepository", new FailedAssertionException("failed to cache splash cause of invalid div. dto = " + splashScreenDto2));
                                    t6rVar.b();
                                    return Unit.a;
                                }
                                zv8 zv8Var = q7rVar.b;
                                String screenId2 = splashScreenDto2.getScreenId();
                                p7rVar.j = splashScreenDto2;
                                p7rVar.k = xveVar;
                                p7rVar.l = rv8Var;
                                p7rVar.m = i2;
                                p7rVar.p = 2;
                                Object a = zv8Var.a(screenId2, rv8Var, p7rVar);
                                if (a == nm6Var) {
                                    return nm6Var;
                                }
                                rv8Var2 = rv8Var;
                                obj = a;
                                splashScreenDto = splashScreenDto2;
                                xveVar2 = xveVar;
                                xyoVar = (xyo) obj;
                                if (!(xyoVar instanceof vyo)) {
                                }
                                J = new qj6(Unit.a);
                                if (J instanceof lj6) {
                                    t6rVar.b();
                                }
                                return Unit.a;
                            }
                            rv8Var = null;
                            if (rv8Var != null) {
                            }
                        }
                        xveVar = null;
                        if (xveVar != null) {
                        }
                    }
                }
                Assertions.throwOrSkip("SplashScreenRepository", new FailedAssertionException("failed to parse splash cause of nullable parameter. dto = " + splashScreenDto2));
                t6rVar.b();
                return Unit.a;
            }
        }
        p7rVar = new p7r(q7rVar, cg6Var);
        Object obj2 = p7rVar.n;
        nm6 nm6Var2 = nm6.a;
        i = p7rVar.p;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
