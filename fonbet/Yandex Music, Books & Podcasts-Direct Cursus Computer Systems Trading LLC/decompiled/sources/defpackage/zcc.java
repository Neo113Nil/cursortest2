package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.playlist_filters.data.local.FiltersLocalInfoDto;
import defpackage.hmm;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class zcc {
    public static final hmm.a d = new hmm.a("filters_data_key");
    public final cc7 a;
    public final frt b;
    public final Gson c;

    public zcc(cc7 cc7Var, frt frtVar) {
        cc7Var.getClass();
        frtVar.getClass();
        this.a = cc7Var;
        this.b = frtVar;
        this.c = new Gson();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        vcc vccVar;
        int i;
        if (cg6Var instanceof vcc) {
            vccVar = (vcc) cg6Var;
            int i2 = vccVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vccVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vccVar.j;
                Object obj2 = nm6.a;
                i = vccVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    vccVar.l = 1;
                    obj = b(vccVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        if (hmmVar != null) {
                            try {
                                String str = (String) hmmVar.a(d);
                                if (str != null) {
                                    return (FiltersLocalInfoDto) this.c.d(str, FiltersLocalInfoDto.class);
                                }
                            } catch (JsonSyntaxException unused) {
                                ssg.a(7, null, "invalid FiltersLocalInfoDto", null);
                                return null;
                            }
                        }
                        return null;
                    }
                    qgg.h0(obj);
                }
                pjc data = ((wb7) obj).getData();
                vccVar.l = 2;
                obj = zsd.i0(data, vccVar);
            }
        }
        vccVar = new vcc(this, cg6Var);
        Object obj3 = vccVar.j;
        Object obj22 = nm6.a;
        i = vccVar.l;
        if (i != 0) {
        }
        pjc data2 = ((wb7) obj3).getData();
        vccVar.l = 2;
        obj3 = zsd.i0(data2, vccVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        wcc wccVar;
        int i;
        cc7 cc7Var;
        if (cg6Var instanceof wcc) {
            wccVar = (wcc) cg6Var;
            int i2 = wccVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wccVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wccVar.k;
                nm6 nm6Var = nm6.a;
                i = wccVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = this.b.g();
                    cc7 cc7Var2 = this.a;
                    wccVar.j = cc7Var2;
                    wccVar.m = 1;
                    obj = zsd.g0(g, wccVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    cc7Var = cc7Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cc7Var = wccVar.j;
                    qgg.h0(obj);
                }
                return ((dc7) cc7Var).c(((xxq) obj).a, "filters_storage");
            }
        }
        wccVar = new wcc(this, cg6Var);
        Object obj2 = wccVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wccVar.m;
        if (i != 0) {
        }
        return ((dc7) cc7Var).c(((xxq) obj2).a, "filters_storage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (defpackage.lmm.a((defpackage.wb7) r7, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(FiltersLocalInfoDto filtersLocalInfoDto, cg6 cg6Var) {
        xcc xccVar;
        int i;
        String j;
        if (cg6Var instanceof xcc) {
            xccVar = (xcc) cg6Var;
            int i2 = xccVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xccVar.m = i2 - Integer.MIN_VALUE;
                Object obj = xccVar.k;
                Object obj2 = nm6.a;
                i = xccVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    j = this.c.j(filtersLocalInfoDto);
                    xccVar.j = j;
                    xccVar.m = 1;
                    obj = b(xccVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = xccVar.j;
                    qgg.h0(obj);
                }
                ycc yccVar = new ycc(j, null);
                xccVar.j = null;
                xccVar.m = 2;
            }
        }
        xccVar = new xcc(this, cg6Var);
        Object obj3 = xccVar.k;
        Object obj22 = nm6.a;
        i = xccVar.m;
        if (i != 0) {
        }
        ycc yccVar2 = new ycc(j, null);
        xccVar.j = null;
        xccVar.m = 2;
    }
}
