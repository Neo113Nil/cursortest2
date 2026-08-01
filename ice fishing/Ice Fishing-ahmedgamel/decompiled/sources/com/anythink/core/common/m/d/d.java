package com.anythink.core.common.m.d;

import D.y;
import com.anythink.core.common.m.b.h;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f14595d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14596e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14597f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14598g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14599h = 3;
    public static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    protected int f14600j;

    /* renamed from: k, reason: collision with root package name */
    protected String f14601k;

    public interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    public void a(String str, String str2, String str3, int i6) {
    }

    public abstract int c();

    public abstract int d();

    public abstract byte[] e();

    public h e_() {
        com.anythink.core.d.b g4 = y.g(y.h());
        if (g4 != null) {
            return new h(g4.H(), g4.I());
        }
        return null;
    }

    public abstract boolean f();

    public int g() {
        return 0;
    }

    public final JSONObject h() {
        return com.anythink.core.common.m.e.a(g());
    }

    public final JSONObject i() {
        return com.anythink.core.common.m.e.b(g());
    }

    public final void a(int i6, String str) {
        this.f14600j = i6;
        this.f14601k = str;
    }

    public static byte[] a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(com.anythink.expressad.foundation.g.a.bR));
            gZIPOutputStream.close();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final void a(a aVar) {
        e.a().a(this, aVar);
    }
}
