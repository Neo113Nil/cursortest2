package defpackage;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class eg8 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        r8 = r20.getAuthority();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8, "set_previous_item") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d2, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d9, code lost:
    
        r3 = defpackage.qee.m(r5, r21, r22, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r3 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
    
        r5 = (defpackage.j66) r3.a;
        r10 = r20.getQueryParameter("animated");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ea, code lost:
    
        if (r10 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ec, code lost:
    
        r10 = java.lang.Boolean.parseBoolean(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f3, code lost:
    
        if (r8 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fd, code lost:
    
        switch(r8.hashCode()) {
            case -1890328395: goto L190;
            case -1789088446: goto L185;
            case -1509135083: goto L180;
            case -1348467885: goto L175;
            case -1280379330: goto L170;
            case -770388272: goto L165;
            case -88123690: goto L156;
            case 633820873: goto L151;
            case 1099321339: goto L146;
            default: goto L130;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
    
        if (r8.equals("scroll_to_position") != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0208, code lost:
    
        r5.o0(defpackage.kjn.d(r20), defpackage.jk9.DP, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0216, code lost:
    
        if (r8.equals("scroll_to_end") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0219, code lost:
    
        r5.p0(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0221, code lost:
    
        if (r8.equals("set_current_item") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0224, code lost:
    
        r0 = r20.getQueryParameter("item");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022a, code lost:
    
        if (r0 != null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x034b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0232, code lost:
    
        r3.B(java.lang.Integer.parseInt(r0), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023d, code lost:
    
        if (r8.equals("scroll_to_start") != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0240, code lost:
    
        r3.B(0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0244, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0249, code lost:
    
        if (r8.equals("set_previous_item") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x024d, code lost:
    
        r3.e(-defpackage.kjn.d(r20), r20.getQueryParameter("overflow"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0259, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025e, code lost:
    
        if (r8.equals("scroll_forward") != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0261, code lost:
    
        r3.z(defpackage.kjn.d(r20), r20.getQueryParameter("overflow"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0271, code lost:
    
        if (r8.equals("scroll_backward") != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0275, code lost:
    
        r3.z(-defpackage.kjn.d(r20), r20.getQueryParameter("overflow"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0281, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0286, code lost:
    
        if (r8.equals("set_next_item") != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x028a, code lost:
    
        r3.e(defpackage.kjn.d(r20), r20.getQueryParameter("overflow"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0295, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029a, code lost:
    
        if (r8.equals("scroll_to_item_id") != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029e, code lost:
    
        r0 = r20.getQueryParameter("item_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a4, code lost:
    
        if (r0 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a8, code lost:
    
        r3.A(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02af, code lost:
    
        if ((r21 instanceof defpackage.gc8) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02b1, code lost:
    
        r9 = (defpackage.gc8) r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b6, code lost:
    
        if (r9 != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02b8, code lost:
    
        r9.I(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02b5, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01f1, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01d4, code lost:
    
        kotlin.jvm.internal.Intrinsics.d(r8, "set_next_item");
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0183, code lost:
    
        if (r5.equals("scroll_to_end") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x018a, code lost:
    
        if (r5.equals("set_current_item") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0192, code lost:
    
        if (r5.equals("scroll_to_start") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x019a, code lost:
    
        if (r5.equals("set_previous_item") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a2, code lost:
    
        if (r5.equals("scroll_forward") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01aa, code lost:
    
        if (r5.equals("scroll_backward") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01b2, code lost:
    
        if (r5.equals("set_next_item") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01ba, code lost:
    
        if (r5.equals("scroll_to_item_id") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
    
        if (r5.equals("scroll_to_position") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01be, code lost:
    
        r5 = r20.getQueryParameter(com.connectsdk.device.ConnectableDevice.KEY_ID);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c2, code lost:
    
        if (r5 != null) goto L131;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, Uri uri, w0a w0aVar, xzb xzbVar) {
        Long r0;
        int y;
        ii8 ii8Var;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        xzb xzbVar2;
        KeyEvent.Callback callback;
        e23 bindingContext;
        if (uri != null && "div-action".equals(uri.getScheme())) {
            String authority = uri.getAuthority();
            if ("set_state".equals(authority)) {
                String queryParameter5 = uri.getQueryParameter("state_id");
                if (queryParameter5 != null) {
                    try {
                        ((gc8) w0aVar).T(kg5.E(queryParameter5), uri.getBooleanQueryParameter("temporary", true));
                        return true;
                    } catch (iak unused) {
                        return false;
                    }
                }
            } else if ("show_tooltip".equals(authority)) {
                String queryParameter6 = uri.getQueryParameter(ConnectableDevice.KEY_ID);
                if (queryParameter6 != null) {
                    ((gc8) w0aVar).P(queryParameter6, uri.getBooleanQueryParameter("multiple", false));
                    return true;
                }
            } else if ("hide_tooltip".equals(authority)) {
                String queryParameter7 = uri.getQueryParameter(ConnectableDevice.KEY_ID);
                if (queryParameter7 != null) {
                    ((gc8) w0aVar).G(queryParameter7);
                    return true;
                }
            } else if ("set_variable".equals(authority)) {
                String queryParameter8 = uri.getQueryParameter("name");
                if (queryParameter8 != null && (queryParameter4 = uri.getQueryParameter(Constants.KEY_VALUE)) != null) {
                    gc8 gc8Var = w0aVar instanceof gc8 ? (gc8) w0aVar : null;
                    if (gc8Var == null) {
                        w0aVar.getClass();
                        return false;
                    }
                    try {
                        if (str != null) {
                            gc8 gc8Var2 = (gc8) w0aVar;
                            List q = bfg.q(gc8Var2, str);
                            if (!q.isEmpty()) {
                                if (q.size() > 1) {
                                    gc8Var2.I(new RuntimeException("Ambiguous scope id. There are " + q.size() + " divs with id '" + str + '\''));
                                } else {
                                    callback = (View) CollectionsKt.Q(q);
                                    if ((callback instanceof f29) && (bindingContext = ((f29) callback).getBindingContext()) != null) {
                                        xzbVar2 = bindingContext.b;
                                        hyf.K(gc8Var, queryParameter8, queryParameter4, xzbVar2);
                                        return true;
                                    }
                                }
                            }
                            callback = null;
                            if (callback instanceof f29) {
                                xzbVar2 = bindingContext.b;
                                hyf.K(gc8Var, queryParameter8, queryParameter4, xzbVar2);
                                return true;
                            }
                        }
                        hyf.K(gc8Var, queryParameter8, queryParameter4, xzbVar2);
                        return true;
                    } catch (wxt e) {
                        e.getMessage();
                        return false;
                    }
                    xzbVar2 = xzbVar;
                }
            } else if ("timer".equals(authority)) {
                String queryParameter9 = uri.getQueryParameter(ConnectableDevice.KEY_ID);
                if (queryParameter9 != null && (queryParameter3 = uri.getQueryParameter(Constants.KEY_ACTION)) != null) {
                    gc8 gc8Var3 = w0aVar instanceof gc8 ? (gc8) w0aVar : null;
                    if (gc8Var3 == null) {
                        w0aVar.getClass();
                        return false;
                    }
                    gc8Var3.s(queryParameter9, queryParameter3);
                    return true;
                }
            } else {
                if (!"video".equals(authority)) {
                    if (authority != null) {
                        switch (authority.hashCode()) {
                            case -1890328395:
                                break;
                            case -1789088446:
                                break;
                            case -1509135083:
                                break;
                            case -1348467885:
                                break;
                            case -1280379330:
                                break;
                            case -770388272:
                                break;
                            case -88123690:
                                break;
                            case 633820873:
                                break;
                            case 1099321339:
                                break;
                        }
                    }
                    if (Intrinsics.d(authority, "set_stored_value")) {
                        gc8 gc8Var4 = w0aVar instanceof gc8 ? (gc8) w0aVar : null;
                        if (gc8Var4 != null) {
                            String queryParameter10 = uri.getQueryParameter("name");
                            if (queryParameter10 == null) {
                                queryParameter10 = null;
                            }
                            if (queryParameter10 != null) {
                                String queryParameter11 = uri.getQueryParameter(Constants.KEY_VALUE);
                                if (queryParameter11 == null) {
                                    queryParameter11 = null;
                                }
                                if (queryParameter11 != null) {
                                    String queryParameter12 = uri.getQueryParameter("lifetime");
                                    if (queryParameter12 == null) {
                                        queryParameter12 = null;
                                    }
                                    if (queryParameter12 != null && (r0 = StringsKt.r0(10, queryParameter12)) != null) {
                                        long longValue = r0.longValue();
                                        String queryParameter13 = uri.getQueryParameter("type");
                                        if (queryParameter13 == null) {
                                            queryParameter13 = null;
                                        }
                                        if (queryParameter13 != null && (y = gdg.y(queryParameter13)) != 0) {
                                            String queryParameter14 = uri.getQueryParameter("scope");
                                            if (queryParameter14 == null) {
                                                queryParameter14 = null;
                                            }
                                            if (queryParameter14 != null) {
                                                ii8 y2 = men.y(queryParameter14);
                                                if (y2 != null) {
                                                    ii8Var = y2;
                                                    return ldg.t(ldg.q(y, queryParameter10, queryParameter11), longValue, gc8Var4, ii8Var);
                                                }
                                                gc8Var4.I(new oir(hrg.q("Value ", queryParameter10, " stored with default scope"), new IllegalArgumentException(ouj.k('\'', "Unknown scope '", queryParameter14))));
                                            }
                                            ii8Var = null;
                                            return ldg.t(ldg.q(y, queryParameter10, queryParameter11), longValue, gc8Var4, ii8Var);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                gc8 gc8Var5 = w0aVar instanceof gc8 ? (gc8) w0aVar : null;
                if (gc8Var5 != null && (queryParameter = uri.getQueryParameter(ConnectableDevice.KEY_ID)) != null && (queryParameter2 = uri.getQueryParameter(Constants.KEY_ACTION)) != null) {
                    return gc8Var5.t(queryParameter, queryParameter2, xzbVar);
                }
            }
        }
        return false;
    }

    public boolean a(bd8 bd8Var, w0a w0aVar, xzb xzbVar) {
        Uri uri;
        uk8 uk8Var = bd8Var.j;
        String str = bd8Var.h;
        boolean e = e(uk8Var, bd8Var.h, bd8Var.f, w0aVar, xzbVar, null);
        szb szbVar = bd8Var.k;
        if (e || weo.B(str, bd8Var.j, w0aVar, xzbVar)) {
            return true;
        }
        Uri uri2 = szbVar != null ? (Uri) szbVar.a(xzbVar) : null;
        if (!leu.F(uri2, w0aVar)) {
            return c(str, uri2, w0aVar, xzbVar);
        }
        gc8 gc8Var = (gc8) w0aVar;
        if (szbVar == null || (uri = (Uri) szbVar.a(xzbVar)) == null || uri.getQueryParameter("url") == null) {
            return false;
        }
        gc8Var.getDiv2Component$div_release().j();
        xq0.w("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
        return false;
    }

    public boolean b(wj9 wj9Var, w0a w0aVar, xzb xzbVar) {
        Uri uri;
        if (e(wj9Var.b(), wj9Var.d(), wj9Var.c(), w0aVar, xzbVar, null) || weo.B(wj9Var.d(), wj9Var.b(), w0aVar, xzbVar)) {
            return true;
        }
        Uri uri2 = wj9Var.getUrl() != null ? (Uri) wj9Var.getUrl().a(xzbVar) : null;
        if (!leu.F(uri2, w0aVar)) {
            return c(wj9Var.d(), uri2, w0aVar, xzbVar);
        }
        gc8 gc8Var = (gc8) w0aVar;
        szb url = wj9Var.getUrl();
        if (url == null || (uri = (Uri) url.a(xzbVar)) == null || uri.getQueryParameter("url") == null) {
            return false;
        }
        gc8Var.getDiv2Component$div_release().j();
        xq0.w("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
        return false;
    }

    public final boolean e(uk8 uk8Var, String str, JSONObject jSONObject, w0a w0aVar, xzb xzbVar, String str2) {
        t1f t1fVar;
        Object obj;
        if (!(uk8Var instanceof ek8)) {
            return false;
        }
        if (jSONObject != null) {
            if (w0aVar instanceof gc8) {
                obj = new v07(2, (gc8) w0aVar);
            } else {
                obj = y7k.a;
            }
            t1fVar = new t1f(0, jSONObject, xzbVar, obj);
        } else {
            t1fVar = null;
        }
        d(uk8Var, w0aVar, t1fVar);
        return true;
    }

    public void d(uk8 uk8Var, w0a w0aVar, t1f t1fVar) {
    }
}
