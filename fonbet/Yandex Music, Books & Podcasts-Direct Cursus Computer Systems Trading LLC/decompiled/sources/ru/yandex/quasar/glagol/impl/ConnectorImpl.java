package ru.yandex.quasar.glagol.impl;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import defpackage.a4i;
import defpackage.gj6;
import defpackage.h08;
import defpackage.hj6;
import defpackage.ij2;
import defpackage.mdk;
import defpackage.n3m;
import defpackage.p46;
import defpackage.s68;
import defpackage.shd;
import defpackage.t1f;
import defpackage.t68;
import defpackage.tzh;
import defpackage.v56;
import defpackage.v68;
import defpackage.w56;
import defpackage.weo;
import defpackage.x0r;
import defpackage.y76;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import ru.yandex.quasar.glagol.impl.ConversationImpl;

/* loaded from: classes6.dex */
public class ConnectorImpl implements y76 {
    private static final String TAG = "Connector";
    final ij2 backendOkHttpClient;
    final p46 config;

    public ConnectorImpl(@NonNull p46 p46Var) {
        this.config = p46Var;
        p46Var.getClass();
        this.backendOkHttpClient = new ij2("https://quasar.yandex.net");
    }

    @NonNull
    private s68 getNewDiscovery(Context context, String str, boolean z, t68 t68Var, a4i a4iVar) throws Exception {
        return new DiscoveryImplV2(this.config, context, str, t68Var, this.backendOkHttpClient, z, a4iVar, null);
    }

    @NonNull
    public gj6 connect(@NonNull v68 v68Var, @NonNull String str, @NonNull tzh tzhVar, h08 h08Var, Executor executor, Context context) throws shd {
        return connectImpl(v68Var, str, getPayloadFactory().getPingPayload(), ConversationImpl.Config.from(this.config), tzhVar, h08Var, executor, context);
    }

    public hj6 connectImpl(@NonNull v68 v68Var, @NonNull String str, mdk mdkVar, @NonNull ConversationImpl.Config config, @NonNull tzh tzhVar, h08 h08Var, Executor executor, Context context) throws shd {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            weo.r(TAG, "connect method will block main thread, use worker thread instead", new Object[0]);
            throw new NetworkOnMainThreadException();
        }
        Executor newSingleThreadExecutor = executor == null ? Executors.newSingleThreadExecutor() : executor;
        a4i a4iVar = new a4i(context, this.config);
        v68Var.getClass();
        JsonObject c = a4i.c(v68Var);
        t1f t1fVar = a4iVar.a;
        t1fVar.V(c, "device");
        t1fVar.V(Integer.valueOf(v68Var.getURI().getPort()), "port");
        t1fVar.V(v68Var.getURI().getHost(), "host");
        return new ConversationImpl(config, v68Var, str, this.backendOkHttpClient, tzhVar, h08Var, newSingleThreadExecutor, a4iVar, mdkVar);
    }

    @NonNull
    public gj6 connectSilent(@NonNull v68 v68Var, @NonNull String str, @NonNull tzh tzhVar, h08 h08Var, Executor executor, Context context) throws shd {
        return connectImpl(v68Var, str, null, ConversationImpl.Config.from(this.config), tzhVar, h08Var, executor, context);
    }

    @NonNull
    public s68 discover(@NonNull Context context, @NonNull String str, @NonNull t68 t68Var) throws shd {
        try {
            return getNewDiscovery(context, str, true, t68Var, new a4i(context, this.config));
        } catch (Throwable th) {
            throw new shd("Failed to start discovery", th);
        }
    }

    @NonNull
    public s68 discoverAll(@NonNull Context context, @NonNull String str, @NonNull t68 t68Var) throws shd {
        try {
            return getNewDiscovery(context, str, false, t68Var, new a4i(context, this.config));
        } catch (Throwable th) {
            throw new shd("Failed to start discovery", th);
        }
    }

    @Override // defpackage.y76
    @NonNull
    public v56 discoverConnections(@NonNull Context context, @NonNull String str, @NonNull w56 w56Var) throws shd {
        try {
            return new ConnectionDiscoveryImpl(context, this, str, w56Var, new a4i(context, this.config));
        } catch (Throwable th) {
            throw new shd("Failed to start connection discovery", th);
        }
    }

    @Override // defpackage.y76
    @NonNull
    public ru.yandex.quasar.glagol.a getPayloadFactory() {
        return new PayloadFactoryImpl();
    }

    @Override // defpackage.y76
    @NonNull
    public x0r getSmarthomeDataApi(Context context, @NonNull String str) {
        p46 p46Var = this.config;
        return new n3m(str, p46Var.b, new a4i(context, p46Var));
    }

    @NonNull
    public gj6 connect(@NonNull v68 v68Var, @NonNull String str, @NonNull tzh tzhVar, Executor executor, Context context) throws shd {
        return connect(v68Var, str, tzhVar, null, executor, context);
    }
}
