package com.plaid.internal;

import java.util.LinkedList;

/* renamed from: com.plaid.internal.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0251p {
    public volatile boolean a;
    public volatile EnumC0223l7 b;
    public volatile String d;
    public String e;
    public final LinkedList c = new LinkedList();
    public C0154e1 f = C0154e1.c;

    /* renamed from: com.plaid.internal.p$a */
    public static class a implements InterfaceC0277s {
        public final String a;
        public int b;

        public a(String str) {
            this.a = str;
        }

        @Override // com.plaid.internal.InterfaceC0277s
        public final int a() {
            return this.b;
        }

        @Override // com.plaid.internal.InterfaceC0277s
        public final String b() {
            return this.a;
        }
    }
}
