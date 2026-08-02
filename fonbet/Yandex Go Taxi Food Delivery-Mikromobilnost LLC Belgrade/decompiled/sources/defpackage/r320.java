package defpackage;

import com.yandex.messaging.div.DivPlugin;

/* loaded from: classes15.dex */
public abstract class r320 {
    public abstract g0c a();

    public abstract sls b();

    public final DivPlugin c(sls slsVar) {
        try {
            Object newInstance = ((zzb) ((lfx) b().invoke())).a().newInstance();
            ((DivPlugin) newInstance).init(slsVar.invoke());
            DivPlugin divPlugin = (DivPlugin) newInstance;
            zbb1.b(a(), divPlugin);
            return divPlugin;
        } catch (Exception e) {
            if (!ydz.a.a()) {
                return null;
            }
            ydz.c("MessagingPlugin", "Error initializing plugin", e);
            return null;
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
