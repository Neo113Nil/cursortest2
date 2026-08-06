package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931zk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0802ul f7283b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f7284c;

    public C0931zk(Context context, InterfaceC0802ul interfaceC0802ul, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f7282a = context;
        this.f7283b = interfaceC0802ul;
        this.f7284c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Om.f4888a.getClass();
        return new Nm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f7282a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f7282a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f7284c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f7282a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C0778tn c0778tn;
        C0905yk B2 = C0610na.f6575I.B();
        Context context = this.f7282a;
        synchronized (B2) {
            try {
                c0778tn = B2.f7248h;
                if (c0778tn == null) {
                    Sm sm = Sm.SERVICE;
                    C0752sn c0752sn = B2.f7247g;
                    if (c0752sn == null) {
                        c0752sn = new C0752sn(new C0699ql(B2.f(context)), "temp_cache");
                        B2.f7247g = c0752sn;
                    }
                    c0778tn = new C0778tn(context, sm, c0752sn);
                    B2.f7248h = c0778tn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0778tn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new C0922zb(this.f7283b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Xc(str, this.f7283b);
    }
}
