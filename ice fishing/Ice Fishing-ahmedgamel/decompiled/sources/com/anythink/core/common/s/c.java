package com.anythink.core.common.s;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17198a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17199b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17200c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17201d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f17202a;

        /* renamed from: b, reason: collision with root package name */
        private String f17203b;

        /* renamed from: c, reason: collision with root package name */
        private int f17204c;

        /* renamed from: d, reason: collision with root package name */
        private int f17205d;

        public final a a(Context context) {
            this.f17202a = context;
            return this;
        }

        public final a b(int i) {
            this.f17205d = i;
            return this;
        }

        private void b() {
            if (TextUtils.isEmpty(this.f17203b) || !this.f17203b.equalsIgnoreCase(u.b.f13638f)) {
                return;
            }
            this.f17204c = 0;
        }

        public final a a(String str) {
            this.f17203b = str;
            return this;
        }

        public final a a(int i) {
            this.f17204c = i;
            return this;
        }

        public final c a() {
            if (!TextUtils.isEmpty(this.f17203b) && this.f17203b.equalsIgnoreCase(u.b.f13638f)) {
                this.f17204c = 0;
            }
            return new c(this.f17202a, this.f17203b, this.f17204c, this.f17205d, (byte) 0);
        }
    }

    public /* synthetic */ c(Context context, String str, int i, int i4, byte b9) {
        this(context, str, i, i4);
    }

    public final Context a() {
        return this.f17198a;
    }

    public final String b() {
        return this.f17199b;
    }

    public final int c() {
        return this.f17200c;
    }

    public final int d() {
        return this.f17201d;
    }

    private c(Context context, String str, int i, int i4) {
        this.f17198a = context;
        this.f17199b = str;
        this.f17200c = i;
        this.f17201d = i4;
    }
}
