package com.anythink.core.common.s;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16411a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16412b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16413c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16414d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f16415a;

        /* renamed from: b, reason: collision with root package name */
        private String f16416b;

        /* renamed from: c, reason: collision with root package name */
        private int f16417c;

        /* renamed from: d, reason: collision with root package name */
        private int f16418d;

        public final a a(Context context) {
            this.f16415a = context;
            return this;
        }

        public final a b(int i) {
            this.f16418d = i;
            return this;
        }

        private void b() {
            if (TextUtils.isEmpty(this.f16416b) || !this.f16416b.equalsIgnoreCase(u.b.f12852f)) {
                return;
            }
            this.f16417c = 0;
        }

        public final a a(String str) {
            this.f16416b = str;
            return this;
        }

        public final a a(int i) {
            this.f16417c = i;
            return this;
        }

        public final c a() {
            if (!TextUtils.isEmpty(this.f16416b) && this.f16416b.equalsIgnoreCase(u.b.f12852f)) {
                this.f16417c = 0;
            }
            return new c(this.f16415a, this.f16416b, this.f16417c, this.f16418d, (byte) 0);
        }
    }

    public /* synthetic */ c(Context context, String str, int i, int i6, byte b9) {
        this(context, str, i, i6);
    }

    public final Context a() {
        return this.f16411a;
    }

    public final String b() {
        return this.f16412b;
    }

    public final int c() {
        return this.f16413c;
    }

    public final int d() {
        return this.f16414d;
    }

    private c(Context context, String str, int i, int i6) {
        this.f16411a = context;
        this.f16412b = str;
        this.f16413c = i;
        this.f16414d = i6;
    }
}
