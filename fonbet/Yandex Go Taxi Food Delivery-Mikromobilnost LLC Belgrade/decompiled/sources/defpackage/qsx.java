package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class qsx {
    public final LinkedHashMap a = new LinkedHashMap();
    public final ArrayList b = new ArrayList();

    public static abstract class a {
        public final LinkedHashMap a = new LinkedHashMap();
        public qsx b;

        /* JADX WARN: Multi-variable type inference failed */
        public final ChatRequest a(String str) {
            ChatRequest chatRequest;
            Iterator it = this.a.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                chatRequest = jl40.l(entry.getValue(), str) ? key : null;
            } while (chatRequest == null);
            return chatRequest;
        }
    }
}
