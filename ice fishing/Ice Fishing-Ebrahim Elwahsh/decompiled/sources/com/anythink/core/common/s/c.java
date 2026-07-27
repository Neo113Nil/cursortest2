package com.anythink.core.common.s;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16569a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16570b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16571c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16572d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f16573a;

        /* renamed from: b, reason: collision with root package name */
        private String f16574b;

        /* renamed from: c, reason: collision with root package name */
        private int f16575c;

        /* renamed from: d, reason: collision with root package name */
        private int f16576d;

        public final a a(Context context) {
            this.f16573a = context;
            return this;
        }

        public final a b(int i) {
            this.f16576d = i;
            return this;
        }

        private void b() {
            if (TextUtils.isEmpty(this.f16574b) || !this.f16574b.equalsIgnoreCase(u.b.f13009f)) {
                return;
            }
            this.f16575c = 0;
        }

        public final a a(String str) {
            this.f16574b = str;
            return this;
        }

        public final a a(int i) {
            this.f16575c = i;
            return this;
        }

        public final c a() {
            if (!TextUtils.isEmpty(this.f16574b) && this.f16574b.equalsIgnoreCase(u.b.f13009f)) {
                this.f16575c = 0;
            }
            return new c(this.f16573a, this.f16574b, this.f16575c, this.f16576d, (byte) 0);
        }
    }

    public /* synthetic */ c(Context context, String str, int i, int i4, byte b9) {
        this(context, str, i, i4);
    }

    public final Context a() {
        return this.f16569a;
    }

    public final String b() {
        return this.f16570b;
    }

    public final int c() {
        return this.f16571c;
    }

    public final int d() {
        return this.f16572d;
    }

    private c(Context context, String str, int i, int i4) {
        this.f16569a = context;
        this.f16570b = str;
        this.f16571c = i;
        this.f16572d = i4;
    }
}
