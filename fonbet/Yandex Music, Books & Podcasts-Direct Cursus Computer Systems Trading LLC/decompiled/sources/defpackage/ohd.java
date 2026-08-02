package defpackage;

import android.content.Context;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ohd {
    public final Context a;
    public final y76 b;
    public final yjd c;

    public ohd(Context context, y76 y76Var, yjd yjdVar) {
        this.a = context;
        this.b = y76Var;
        this.c = yjdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ohd ohdVar, dkd dkdVar, List list, cg6 cg6Var) {
        jhd jhdVar;
        int i;
        ArrayList arrayList;
        String hostAddress;
        List e0;
        String str;
        if (cg6Var instanceof jhd) {
            jhdVar = (jhd) cg6Var;
            int i2 = jhdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jhdVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jhdVar.k;
                nm6 nm6Var = nm6.a;
                i = jhdVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        return phd.c;
                    }
                    jhdVar.j = list;
                    jhdVar.m = 1;
                    obj = gld.Q(new d57(list, ohdVar, dkdVar, continuation, 18), jhdVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = jhdVar.j;
                    qgg.h0(obj);
                }
                arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    Pattern pattern = zjd.a;
                    String uri = ((egd) obj2).b.getURI().toString();
                    uri.getClass();
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    ArrayList arrayList2 = new ArrayList();
                    networkInterfaces.getClass();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        inetAddresses.getClass();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet6Address) && (hostAddress = ((Inet6Address) nextElement).getHostAddress()) != null && (e0 = StringsKt.e0(hostAddress, new char[]{'%'}, 6)) != null && (str = (String) CollectionsKt.S(e0, 0)) != null) {
                                arrayList2.add(str);
                            }
                        }
                    }
                    Matcher matcher = zjd.a.matcher(uri);
                    String group = matcher.find() ? matcher.group(1) : null;
                    if (!arrayList2.isEmpty() && group != null) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                if (zjd.a(group).equalsIgnoreCase(zjd.a((String) it.next()))) {
                                }
                            }
                        }
                    }
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    nmb nmbVar = j74.a;
                    j74.b(okb.Station, slb.Glagol);
                }
                ssg.a(3, null, dfi.c(arrayList.size(), "discovery sort result: ", " stations"), null);
                return new phd(list, arrayList);
            }
        }
        jhdVar = new jhd(ohdVar, cg6Var);
        Object obj3 = jhdVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jhdVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        arrayList = new ArrayList();
        while (r11.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        ssg.a(3, null, dfi.c(arrayList.size(), "discovery sort result: ", " stations"), null);
        return new phd(list, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (r12.invoke(r10, r0) == r13) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r10 == r13) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v9, types: [lc4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b2 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ohd ohdVar, zi3 zi3Var, d57 d57Var, cg6 cg6Var) {
        mhd mhdVar;
        Object obj;
        nm6 nm6Var;
        int i;
        Function2 function2;
        zi3 zi3Var2;
        lc4 lc4Var;
        Function2 function22;
        si3 it;
        Function2 function23;
        si3 si3Var;
        Object c;
        if (cg6Var instanceof mhd) {
            mhdVar = (mhd) cg6Var;
            int i2 = mhdVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mhdVar.o = i2 - Integer.MIN_VALUE;
                obj = mhdVar.m;
                nm6Var = nm6.a;
                i = mhdVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    g68 g68Var = new g68(zi3Var, continuation, 27);
                    mhdVar.j = zi3Var;
                    mhdVar.k = d57Var;
                    mhdVar.o = 1;
                    obj = tyf.L(5000L, g68Var, mhdVar);
                    zi3Var2 = zi3Var;
                    function2 = d57Var;
                } else if (i == 1) {
                    Function2 function24 = mhdVar.k;
                    ?? r11 = mhdVar.j;
                    qgg.h0(obj);
                    zi3Var2 = r11;
                    function2 = function24;
                } else {
                    if (i == 2) {
                        function22 = mhdVar.k;
                        lc4Var = mhdVar.j;
                        qgg.h0(obj);
                        it = lc4Var.iterator();
                        mhdVar.j = null;
                        mhdVar.k = function22;
                        mhdVar.l = it;
                        mhdVar.o = 3;
                        c = it.c(mhdVar);
                        if (c != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        si3Var = mhdVar.l;
                        function23 = mhdVar.k;
                        qgg.h0(obj);
                        it = si3Var;
                        function22 = function23;
                        mhdVar.j = null;
                        mhdVar.k = function22;
                        mhdVar.l = it;
                        mhdVar.o = 3;
                        c = it.c(mhdVar);
                        if (c != nm6Var) {
                            Function2 function25 = function22;
                            si3Var = it;
                            obj = c;
                            function23 = function25;
                            if (((Boolean) obj).booleanValue()) {
                                return Unit.a;
                            }
                            List list = (List) si3Var.d();
                            mhdVar.j = null;
                            mhdVar.k = function23;
                            mhdVar.l = si3Var;
                            mhdVar.o = 4;
                        }
                        return nm6Var;
                    }
                    si3Var = mhdVar.l;
                    function23 = mhdVar.k;
                    qgg.h0(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                mhdVar.j = zi3Var2;
                mhdVar.k = function2;
                mhdVar.o = 2;
                if (function2.invoke((List) obj, mhdVar) != nm6Var) {
                    Function2 function26 = function2;
                    lc4Var = zi3Var2;
                    function22 = function26;
                    it = lc4Var.iterator();
                    mhdVar.j = null;
                    mhdVar.k = function22;
                    mhdVar.l = it;
                    mhdVar.o = 3;
                    c = it.c(mhdVar);
                    if (c != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        mhdVar = new mhd(ohdVar, cg6Var);
        obj = mhdVar.m;
        nm6Var = nm6.a;
        i = mhdVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mhdVar.j = zi3Var2;
        mhdVar.k = function2;
        mhdVar.o = 2;
        if (function2.invoke((List) obj, mhdVar) != nm6Var) {
        }
        return nm6Var;
    }
}
