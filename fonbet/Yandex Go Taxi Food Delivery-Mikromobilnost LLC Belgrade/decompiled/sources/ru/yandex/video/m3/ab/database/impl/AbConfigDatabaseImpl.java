package ru.yandex.video.m3.ab.database.impl;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.sbx;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.database.AbConfigDatabase;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/ab/database/impl/AbConfigDatabaseImpl;", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lsbx;", "json", "<init>", "(Landroid/content/SharedPreferences;Lsbx;)V", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig", "()Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "abConfigWithMeta", "Lzy11;", "updateConfig", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "invalidate", "()V", "Landroid/content/SharedPreferences;", "Lsbx;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbConfigDatabaseImpl implements AbConfigDatabase {
    private static final String AB_CONFIG_KEY = "AB_CONFIG_KEY";
    private static volatile AbConfigDatabase INSTANCE = null;
    private static final String SHARED_PREFERENCES_KEY = "ru.yandex.video.ab.database.pref";
    private final sbx json;
    private final SharedPreferences sharedPreferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private AbConfigDatabaseImpl(SharedPreferences sharedPreferences, sbx sbxVar) {
        this.sharedPreferences = sharedPreferences;
        this.json = sbxVar;
    }

    @Override // ru.yandex.video.m3.ab.database.AbConfigDatabase
    public AbConfigWithMeta getConfig() {
        Object failure;
        try {
            String string = this.sharedPreferences.getString(AB_CONFIG_KEY, null);
            if (string != null) {
                sbx sbxVar = this.json;
                sbxVar.getClass();
                failure = (AbConfigWithMeta) sbxVar.b(AbConfigWithMeta.INSTANCE.serializer(), string);
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        AbConfigWithMeta abConfigWithMeta = (AbConfigWithMeta) (failure instanceof Result.Failure ? null : failure);
        return abConfigWithMeta == null ? AbConfigWithMeta.INSTANCE.getDEFAULT() : abConfigWithMeta;
    }

    @Override // ru.yandex.video.m3.ab.database.AbConfigDatabase
    public void invalidate() {
        synchronized (this) {
            this.sharedPreferences.edit().clear().apply();
        }
    }

    @Override // ru.yandex.video.m3.ab.database.AbConfigDatabase
    public void updateConfig(AbConfigWithMeta abConfigWithMeta) {
        Object failure;
        synchronized (this) {
            try {
                sbx sbxVar = this.json;
                sbxVar.getClass();
                failure = sbxVar.c(abConfigWithMeta, AbConfigWithMeta.INSTANCE.serializer());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putString(AB_CONFIG_KEY, (String) failure);
            edit.apply();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/ab/database/impl/AbConfigDatabaseImpl$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsbx;", "json", "Lzy11;", "initialize", "(Landroid/content/Context;Lsbx;)V", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "get", "()Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "INSTANCE", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "getINSTANCE$annotations", "", AbConfigDatabaseImpl.AB_CONFIG_KEY, "Ljava/lang/String;", "SHARED_PREFERENCES_KEY", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getINSTANCE$annotations() {
        }

        public final AbConfigDatabase get() {
            AbConfigDatabase abConfigDatabase;
            AbConfigDatabase abConfigDatabase2 = AbConfigDatabaseImpl.INSTANCE;
            if (abConfigDatabase2 != null) {
                return abConfigDatabase2;
            }
            synchronized (this) {
                abConfigDatabase = AbConfigDatabaseImpl.INSTANCE;
                if (abConfigDatabase == null) {
                    abConfigDatabase = new DummyAbConfigDatabaseImpl();
                }
            }
            return abConfigDatabase;
        }

        public final void initialize(Context context, sbx json2) {
            synchronized (this) {
                if (AbConfigDatabaseImpl.INSTANCE == null) {
                    AbConfigDatabaseImpl.INSTANCE = new AbConfigDatabaseImpl(context.getSharedPreferences(AbConfigDatabaseImpl.SHARED_PREFERENCES_KEY, 0), json2, null);
                }
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbConfigDatabaseImpl(SharedPreferences sharedPreferences, sbx sbxVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, sbxVar);
    }
}
