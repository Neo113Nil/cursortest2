package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public final class j extends g {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final Z5.d createFakePushSub() {
            Z5.d dVar = new Z5.d();
            dVar.setId("");
            dVar.setType(Z5.g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }

        private a() {
        }
    }

    public j() {
        super(Companion.createFakePushSub());
    }
}
