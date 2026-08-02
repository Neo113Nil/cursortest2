package defpackage;

import android.net.Uri;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWall;
import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWallAdapter;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.MessengerSupportContextAdapter;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.DirectiveAdapter;
import com.yandex.messaging.core.net.entities.directives.ServerDirective;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.UriJsonAdapter;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes15.dex */
public final /* synthetic */ class tmj implements JsonAdapter.Factory {
    public final /* synthetic */ int a;

    public /* synthetic */ tmj(int i) {
        this.a = i;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        JsonAdapter JSON_ADAPTER_FACTORY$lambda$0;
        switch (this.a) {
            case 0:
                tmj tmjVar = DirectiveAdapter.b;
                if (Directive.class.equals(type) || ServerDirective.class.equals(type)) {
                    return new DirectiveAdapter(moshi);
                }
                return null;
            case 1:
                if (type.equals(GetChatInfoDataWithJoinWall.class)) {
                    return new GetChatInfoDataWithJoinWallAdapter(moshi);
                }
                return null;
            case 2:
                JSON_ADAPTER_FACTORY$lambda$0 = LocalMessageRef.JSON_ADAPTER_FACTORY$lambda$0(type, set, moshi);
                return JSON_ADAPTER_FACTORY$lambda$0;
            case 3:
                if (MessengerSupportContext.class.equals(type)) {
                    return new MessengerSupportContextAdapter();
                }
                return null;
            default:
                if (Uri.class.equals(type)) {
                    return new UriJsonAdapter(moshi);
                }
                return null;
        }
    }
}
