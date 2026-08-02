package com.anythink.core.common.m.d;

import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.m.b.h;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15381d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15382e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15383f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f15384g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f15385h = 3;
    public static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    protected int f15386j;

    /* renamed from: k, reason: collision with root package name */
    protected String f15387k;

    public interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    public void a(String str, String str2, String str3, int i4) {
    }

    public abstract int c();

    public abstract int d();

    public abstract byte[] e();

    public h e_() {
        com.anythink.core.d.b k9 = k.k(k.l());
        if (k9 != null) {
            return new h(k9.H(), k9.I());
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

    public final void a(int i4, String str) {
        this.f15386j = i4;
        this.f15387k = str;
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
