package com.onesignal.location.internal;

import a5.InterfaceC0437a;
import kotlin.jvm.internal.e;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements InterfaceC0437a {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // a5.InterfaceC0437a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // a5.InterfaceC0437a
    public Object requestPermission(InterfaceC5267d interfaceC5267d) {
        throw Companion.getEXCEPTION();
    }

    @Override // a5.InterfaceC0437a
    public void setShared(boolean z3) {
        throw Companion.getEXCEPTION();
    }
}
