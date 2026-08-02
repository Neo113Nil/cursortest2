package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import java.util.Locale;
import java.util.Map;
import kotlin.a;

/* loaded from: classes15.dex */
public final class z5z {
    public final at2 a;
    public final i3y b = a.a(new yow(20, this));

    public z5z(at2 at2Var) {
        this.a = at2Var;
    }

    public final LocalizedData a(String str) {
        String language = Locale.getDefault().getLanguage();
        i3y i3yVar = this.b;
        hv21 a = ((cv21) i3yVar.getValue()).a(str);
        LocalizationDescriptor localizationDescriptor = a != null ? a.c : null;
        if (localizationDescriptor != null && !language.equals(localizationDescriptor.getDefault())) {
            hv21 a2 = ((cv21) i3yVar.getValue()).a(str);
            Map map = a2 != null ? a2.d : null;
            if (map != null) {
                return (LocalizedData) map.get(language);
            }
        }
        return null;
    }
}
