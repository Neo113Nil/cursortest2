package com.onesignal.user.internal.jwt;

import B7.h;
import I7.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p4.d;
import u7.AbstractC5091i;
import u7.v;
import v7.AbstractC5129j;
import v7.t;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c {
    private final J4.b _prefs;
    private final com.onesignal.common.events.b internalUpdateListeners;
    private boolean isLoaded;
    private final com.onesignal.common.events.b publicInvalidatedListeners;
    private final Map<String, String> tokens;

    public static final class a extends h implements l {
        final /* synthetic */ String $externalId;
        int label;

        /* renamed from: com.onesignal.user.internal.jwt.c$a$a, reason: collision with other inner class name */
        public static final class C0250a extends i implements l {
            final /* synthetic */ String $externalId;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0250a(c cVar, String str) {
                super(1);
                this.this$0 = cVar;
                this.$externalId = str;
            }

            @Override // I7.l
            public /* synthetic */ Object invoke(Object obj) {
                if (obj != null) {
                    throw new ClassCastException();
                }
                invoke((d) null);
                return v.f41350a;
            }

            public final void invoke(d listener) {
                Object f3;
                kotlin.jvm.internal.h.e(listener, "listener");
                String externalId = this.$externalId;
                try {
                    kotlin.jvm.internal.h.e(externalId, "externalId");
                    listener.a();
                    f3 = v.f41350a;
                } catch (Throwable th) {
                    f3 = com.bumptech.glide.d.f(th);
                }
                String str = this.$externalId;
                Throwable a9 = AbstractC5091i.a(f3);
                if (a9 != null) {
                    com.onesignal.debug.internal.logging.b.warn("JwtTokenStore: IUserJwtInvalidatedListener threw for externalId=" + str, a9);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$externalId = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return c.this.new a(this.$externalId, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            c.this.publicInvalidatedListeners.fire(new C0250a(c.this, this.$externalId));
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public static final class b extends i implements l {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return v.f41350a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    /* renamed from: com.onesignal.user.internal.jwt.c$c, reason: collision with other inner class name */
    public static final class C0251c extends i implements l {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0251c(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return v.f41350a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    public c(J4.b _prefs) {
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.tokens = new LinkedHashMap();
        this.internalUpdateListeners = new com.onesignal.common.events.b();
        this.publicInvalidatedListeners = new com.onesignal.common.events.b();
    }

    private final void ensureLoaded() {
        if (this.isLoaded) {
            return;
        }
        String string$default = J4.a.getString$default(this._prefs, com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", null, 4, null);
        if (string$default != null) {
            try {
                JSONObject jSONObject = new JSONObject(string$default);
                Iterator<String> keys = jSONObject.keys();
                kotlin.jvm.internal.h.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Map<String, String> map = this.tokens;
                    kotlin.jvm.internal.h.b(next);
                    String string = jSONObject.getString(next);
                    kotlin.jvm.internal.h.d(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (JSONException e9) {
                com.onesignal.debug.internal.logging.b.warn$default("JwtTokenStore: failed to parse persisted tokens, starting fresh: " + e9.getMessage(), null, 2, null);
            }
        }
        this.isLoaded = true;
    }

    private final void persist() {
        this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", new JSONObject(t.U(this.tokens)).toString());
    }

    public final void addInternalUpdateListener(com.onesignal.user.internal.jwt.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.internalUpdateListeners.subscribe(listener);
    }

    public final void addUserJwtInvalidatedListener(d listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.publicInvalidatedListeners.subscribe(listener);
    }

    public final String getJwt(String externalId) {
        String str;
        kotlin.jvm.internal.h.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            str = this.tokens.get(externalId);
        }
        return str;
    }

    public final void invalidateJwt(String externalId) {
        boolean z3;
        kotlin.jvm.internal.h.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            z3 = this.tokens.remove(externalId) != null;
            if (z3) {
                persist();
            }
        }
        if (z3) {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(externalId, null));
        }
    }

    public final void pruneToExternalIds(Set<String> activeIds) {
        Set P8;
        kotlin.jvm.internal.h.e(activeIds, "activeIds");
        synchronized (this.tokens) {
            ensureLoaded();
            P8 = AbstractC5129j.P(A8.b.p(this.tokens.keySet(), activeIds));
            if (!P8.isEmpty()) {
                this.tokens.keySet().removeAll(P8);
                persist();
            }
        }
        Iterator it = P8.iterator();
        while (it.hasNext()) {
            this.internalUpdateListeners.fire(new b((String) it.next()));
        }
    }

    public final void putJwt(String externalId, String str) {
        boolean a9;
        kotlin.jvm.internal.h.e(externalId, "externalId");
        if (str == null) {
            return;
        }
        synchronized (this.tokens) {
            ensureLoaded();
            a9 = kotlin.jvm.internal.h.a(this.tokens.get(externalId), str);
            this.tokens.put(externalId, str);
            if (!a9) {
                persist();
            }
        }
        if (a9) {
            return;
        }
        this.internalUpdateListeners.fire(new C0251c(externalId));
    }

    public final void removeInternalUpdateListener(com.onesignal.user.internal.jwt.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.internalUpdateListeners.unsubscribe(listener);
    }

    public final void removeUserJwtInvalidatedListener(d listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.publicInvalidatedListeners.unsubscribe(listener);
    }
}
