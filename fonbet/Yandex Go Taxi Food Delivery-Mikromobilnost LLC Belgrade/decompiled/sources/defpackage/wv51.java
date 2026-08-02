package defpackage;

import android.text.TextPaint;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.v6;
import com.ybsdk.widgets.common.YbSdkScalableTextView;
import java.util.LinkedHashMap;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class wv51 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wv51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        TextPaint mPaint_delegate$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mPaint_delegate$lambda$0 = YbSdkScalableTextView.mPaint_delegate$lambda$0((YbSdkScalableTextView) obj);
                return mPaint_delegate$lambda$0;
            case 1:
                ((yn50) ((g9v) obj)).a();
                return zy11.a;
            default:
                v6 v6Var = ZoneTariffInfo.Companion;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (c cVar : ((ZoneTariffInfo) obj).o) {
                    linkedHashMap.put(cVar.c, cVar);
                }
                return linkedHashMap;
        }
    }
}
