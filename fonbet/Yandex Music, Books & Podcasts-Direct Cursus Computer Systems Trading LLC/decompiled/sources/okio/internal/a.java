package okio.internal;

import defpackage.a9f;
import defpackage.b9f;
import defpackage.btf;
import defpackage.cak;
import defpackage.fxf;
import defpackage.h;
import defpackage.h1b;
import defpackage.jmq;
import defpackage.jyr;
import defpackage.kac;
import defpackage.kgk;
import defpackage.lac;
import defpackage.n3r;
import defpackage.v75;
import defpackage.v97;
import defpackage.wfl;
import defpackage.z75;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class a extends lac {
    public static final cak e;
    public final ClassLoader b;
    public final lac c;
    public final jyr d;

    static {
        String str = cak.b;
        e = h1b.M("/");
    }

    public a(ClassLoader classLoader) {
        classLoader.getClass();
        b9f b9fVar = lac.a;
        b9fVar.getClass();
        this.b = classLoader;
        this.c = b9fVar;
        this.d = btf.b(new kgk(12, this));
    }

    @Override // defpackage.lac
    public final jmq a(cak cakVar) {
        cakVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.lac
    public final void b(cak cakVar, cak cakVar2) {
        cakVar.getClass();
        cakVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.lac
    public final void c(cak cakVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.lac
    public final void d(cak cakVar) {
        cakVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.lac
    public final List g(cak cakVar) {
        cakVar.getClass();
        cak cakVar2 = e;
        cakVar2.getClass();
        String u = h.b(cakVar2, cakVar, true).c(cakVar2).a.u();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.d.getValue()) {
            lac lacVar = (lac) pair.a;
            cak cakVar3 = (cak) pair.b;
            try {
                List g = lacVar.g(cakVar3.d(u));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g) {
                    if (wfl.a((cak) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cak cakVar4 = (cak) it.next();
                    cakVar4.getClass();
                    String replace = StringsKt.Y(cakVar4.a.u(), cakVar3.a.u()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(cakVar2.d(replace));
                }
                z75.t(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.w0(linkedHashSet);
        }
        kac.e(cakVar, "file not found: ");
        return null;
    }

    @Override // defpackage.lac
    public final v97 i(cak cakVar) {
        cakVar.getClass();
        if (!wfl.a(cakVar)) {
            return null;
        }
        cak cakVar2 = e;
        cakVar2.getClass();
        String u = h.b(cakVar2, cakVar, true).c(cakVar2).a.u();
        for (Pair pair : (List) this.d.getValue()) {
            v97 i = ((lac) pair.a).i(((cak) pair.b).d(u));
            if (i != null) {
                return i;
            }
        }
        return null;
    }

    @Override // defpackage.lac
    public final a9f j(cak cakVar) {
        if (!wfl.a(cakVar)) {
            kac.e(cakVar, "file not found: ");
            return null;
        }
        cak cakVar2 = e;
        cakVar2.getClass();
        String u = h.b(cakVar2, cakVar, true).c(cakVar2).a.u();
        for (Pair pair : (List) this.d.getValue()) {
            try {
                return ((lac) pair.a).j(((cak) pair.b).d(u));
            } catch (FileNotFoundException unused) {
            }
        }
        kac.e(cakVar, "file not found: ");
        return null;
    }

    @Override // defpackage.lac
    public final jmq k(cak cakVar) {
        cakVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.lac
    public final n3r l(cak cakVar) {
        cakVar.getClass();
        if (!wfl.a(cakVar)) {
            kac.e(cakVar, "file not found: ");
            return null;
        }
        cak cakVar2 = e;
        cakVar2.getClass();
        URL resource = this.b.getResource(h.b(cakVar2, cakVar, false).c(cakVar2).a.u());
        if (resource == null) {
            kac.e(cakVar, "file not found: ");
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        inputStream.getClass();
        return fxf.T(inputStream);
    }
}
