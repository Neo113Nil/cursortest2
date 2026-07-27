package com.onesignal.user.internal.jwt;

import E7.l;
import com.bumptech.glide.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import l4.d;
import org.json.JSONException;
import org.json.JSONObject;
import q7.AbstractC4940i;
import q7.v;
import r7.AbstractC4979j;
import r7.t;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class c {
    private final F4.b _prefs;
    private final com.onesignal.common.events.b internalUpdateListeners;
    private boolean isLoaded;
    private final com.onesignal.common.events.b publicInvalidatedListeners;
    private final Map<String, String> tokens;

    public static final class a extends h implements l {
        final /* synthetic */ String $externalId;
        int label;

        /* renamed from: com.onesignal.user.internal.jwt.c$a$a, reason: collision with other inner class name */
        public static final class C0249a extends i implements l {
            final /* synthetic */ String $externalId;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0249a(c cVar, String str) {
                super(1);
                this.this$0 = cVar;
                this.$externalId = str;
            }

            @Override // E7.l
            public /* synthetic */ Object invoke(Object obj) {
                if (obj != null) {
                    throw new ClassCastException();
                }
                invoke((d) null);
                return v.f40183a;
            }

            public final void invoke(d listener) {
                Object e6;
                kotlin.jvm.internal.h.e(listener, "listener");
                String externalId = this.$externalId;
                try {
                    kotlin.jvm.internal.h.e(externalId, "externalId");
                    listener.a();
                    e6 = v.f40183a;
                } catch (Throwable th) {
                    e6 = f.e(th);
                }
                String str = this.$externalId;
                Throwable a9 = AbstractC4940i.a(e6);
                if (a9 != null) {
                    com.onesignal.debug.internal.logging.b.warn("JwtTokenStore: IUserJwtInvalidatedListener threw for externalId=" + str, a9);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$externalId = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return c.this.new a(this.$externalId, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
            c.this.publicInvalidatedListeners.fire(new C0249a(c.this, this.$externalId));
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends i implements l {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return v.f40183a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    /* renamed from: com.onesignal.user.internal.jwt.c$c, reason: collision with other inner class name */
    public static final class C0250c extends i implements l {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0250c(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return v.f40183a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    public c(F4.b _prefs) {
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
        String string$default = F4.a.getString$default(this._prefs, com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", null, 4, null);
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
            } catch (JSONException e6) {
                com.onesignal.debug.internal.logging.b.warn$default("JwtTokenStore: failed to parse persisted tokens, starting fresh: " + e6.getMessage(), null, 2, null);
            }
        }
        this.isLoaded = true;
    }

    private final void persist() {
        this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", new JSONObject(t.E(this.tokens)).toString());
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
        boolean z8;
        kotlin.jvm.internal.h.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            z8 = this.tokens.remove(externalId) != null;
            if (z8) {
                persist();
            }
        }
        if (z8) {
            com.onesignal.common.threading.b.INSTANCE.launchOnDefault(new a(externalId, null));
        }
    }

    public final void pruneToExternalIds(Set<String> activeIds) {
        Set V8;
        kotlin.jvm.internal.h.e(activeIds, "activeIds");
        synchronized (this.tokens) {
            ensureLoaded();
            V8 = AbstractC4979j.V(K3.b.s(this.tokens.keySet(), activeIds));
            if (!V8.isEmpty()) {
                this.tokens.keySet().removeAll(V8);
                persist();
            }
        }
        Iterator it = V8.iterator();
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
        this.internalUpdateListeners.fire(new C0250c(externalId));
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
