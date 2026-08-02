package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes4.dex */
public final /* synthetic */ class vw1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vw1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        z6n z6nVar;
        switch (this.a) {
            case 0:
                return l1b.c(this.b);
            case 1:
                Context context = this.b;
                b9f b9fVar = lac.a;
                dq7 dq7Var = ca8.a;
                mn7 mn7Var = mn7.d;
                File cacheDir = context.getCacheDir();
                cacheDir.mkdirs();
                File l = cbc.l(cacheDir, "div_image_cache");
                String str = cak.b;
                cak N = h1b.N(l);
                try {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                    j = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
                } catch (Exception e) {
                    Assertions.fail(e);
                    j = 0;
                }
                long d = yhn.d((int) (j * 0.1d), 262144000, 1073741824);
                if (d <= 0) {
                    xq0.x("size must be > 0.");
                    return null;
                }
                if (0.0d > 0.0d) {
                    try {
                        File file = N.toFile();
                        file.mkdir();
                        StatFs statFs2 = new StatFs(file.getAbsolutePath());
                        d = yhn.f((long) (0.0d * statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()), 10485760L, 262144000L);
                    } catch (Exception unused) {
                        d = 10485760;
                    }
                }
                return new pkn(d, b9fVar, N, mn7Var);
            case 2:
                return l1b.h(this.b);
            case 3:
                Context context2 = this.b;
                synchronized (c3x.class) {
                    try {
                        if (c3x.a == null) {
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext != null) {
                                context2 = applicationContext;
                            }
                            c3x.a = new z6n(new k81(context2, false));
                        }
                        z6nVar = c3x.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (tax) ((u0x) z6nVar.b).d();
            case 4:
                bzf.H(this.b);
                return Unit.a;
            case 5:
                bzf.I(this.b);
                return Unit.a;
            case 6:
                bzf.H(this.b);
                return Unit.a;
            case 7:
                bzf.I(this.b);
                return Unit.a;
            case 8:
                bzf.I(this.b);
                return Unit.a;
            case 9:
                bzf.H(this.b);
                return Unit.a;
            case 10:
                File file2 = new File(this.b.getCacheDir(), "network_file_cache");
                file2.mkdirs();
                return file2;
            case 11:
                return this.b.getSharedPreferences("prefs.notifications", 0);
            case 12:
                return this.b.getSharedPreferences("prefs.notifications", 0);
            case 13:
                return new File(this.b.getFilesDir(), "primaryLogs");
            case 14:
                return this.b.getSharedPreferences("retries_policy", 0);
            case 15:
                return this.b.getString(R.string.player_seek_backward_description, 15);
            case 16:
                return this.b.getString(R.string.player_seek_forward_description, 30);
            case 17:
                Context context3 = this.b;
                return context3.getString(R.string.menu_element_dislike) + StringUtil.SPACE + context3.getString(R.string.accessibility_checked);
            case 18:
                Context context4 = this.b;
                return context4.getString(R.string.menu_element_dislike) + StringUtil.SPACE + context4.getString(R.string.accessibility_not_checked);
            case 19:
                Context context5 = this.b;
                return context5.getString(R.string.menu_element_like) + StringUtil.SPACE + context5.getString(R.string.accessibility_checked);
            case 20:
                Context context6 = this.b;
                return context6.getString(R.string.menu_element_like) + StringUtil.SPACE + context6.getString(R.string.accessibility_not_checked);
            case 21:
                Context context7 = this.b;
                return context7.getString(R.string.accessibility_disabled) + StringUtil.SPACE + context7.getString(R.string.player_previous_description);
            case 22:
                Context context8 = this.b;
                return context8.getString(R.string.accessibility_disabled) + StringUtil.SPACE + context8.getString(R.string.player_skip_description);
            case 23:
                IReporterYandex reporter = AppMetricaYandex.getReporter(this.b, "96bbbe34-a1bd-4b8a-8126-29879cd5d463");
                reporter.getClass();
                return reporter;
            case 24:
                return this.b.getSharedPreferences("account_status_updater", 0);
            case 25:
                return l1b.h(this.b);
            case 26:
                return Boolean.valueOf(new File(this.b.getFilesDir(), "details_enabled").exists());
            case 27:
                return datastore_release.a(this.b, "coolDownUid.json");
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Context applicationContext2 = this.b.getApplicationContext();
                applicationContext2.getClass();
                return emm.a(applicationContext2, "yandex-datastore");
            default:
                return datastore_release.a(this.b, "urlTemplates.json");
        }
    }

    public /* synthetic */ vw1(Context context, ygh yghVar, int i) {
        this.a = i;
        this.b = context;
    }

    public /* synthetic */ vw1(Context context, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = context;
    }
}
