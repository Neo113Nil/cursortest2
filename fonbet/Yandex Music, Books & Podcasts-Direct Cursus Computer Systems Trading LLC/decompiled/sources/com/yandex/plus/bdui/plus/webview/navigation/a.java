package com.yandex.plus.bdui.plus.webview.navigation;

import android.graphics.Shader;
import android.view.View;
import android.widget.ImageView;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import com.yandex.pulse.metrics.o;
import defpackage.cp0;
import defpackage.g4f;
import defpackage.y7k;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                bVar.getClass();
                break;
            case 1:
                b bVar2 = (b) obj;
                bVar2.getClass();
                break;
            case 2:
                ((com.yandex.plus.log.api.a) obj).getClass();
                break;
            case 3:
                com.yandex.plus.core.debug.panel.internal.model.ui.d dVar = (com.yandex.plus.core.debug.panel.internal.model.ui.d) obj;
                dVar.getClass();
                break;
            case 4:
                ((Shader) obj).getClass();
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 7:
                Long l = (Long) obj;
                l.longValue();
                break;
            case 8:
                Float f = (Float) obj;
                f.floatValue();
                break;
            case 9:
                Double d = (Double) obj;
                d.doubleValue();
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                break;
            case 11:
                List list = (List) obj;
                list.getClass();
                break;
            case 12:
                Map map = (Map) obj;
                map.getClass();
                break;
            case 13:
                obj.getClass();
                if (obj instanceof JSONArray) {
                    break;
                }
                break;
            case 14:
                obj.getClass();
                if (obj instanceof JSONObject) {
                    break;
                }
                break;
            case 15:
                ((Integer) obj).intValue();
                break;
            case 16:
                y7k y7kVar = (y7k) obj;
                y7kVar.getClass();
                break;
            case 17:
                cp0 cp0Var = (cp0) obj;
                cp0Var.getClass();
                break;
            case 18:
                e eVar = (e) obj;
                eVar.getClass();
                break;
            case 19:
                e eVar2 = (e) obj;
                eVar2.getClass();
                break;
            case 20:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                break;
            case 21:
                ((Integer) obj).intValue();
                break;
            case 22:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                break;
            case 23:
                break;
            case 24:
                ((Integer) obj).intValue();
                int i = GiftProgressView.n;
                break;
            case 25:
                View view = (View) obj;
                int i2 = com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b.o;
                view.getClass();
                if (view instanceof ImageView) {
                    break;
                }
                break;
            case 26:
                ((com.yandex.plus.home.feature.webviews.internalapi.authorization.d) obj).getClass();
                break;
            case 27:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) obj).getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                p pVar = (p) obj;
                if (pVar != null) {
                    pVar.E();
                }
                break;
            default:
                ((com.yandex.plus.home.feature.webviews.internalapi.toolbar.b) obj).getClass();
                break;
        }
        return Unit.a;
    }
}
