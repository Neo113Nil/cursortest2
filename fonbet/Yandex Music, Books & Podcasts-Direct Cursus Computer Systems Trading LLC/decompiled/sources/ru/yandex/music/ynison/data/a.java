package ru.yandex.music.ynison.data;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import defpackage.aur;
import defpackage.c5b;
import defpackage.fow;
import defpackage.gao;
import defpackage.gow;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.prw;
import defpackage.qgg;
import defpackage.vqw;
import defpackage.wqw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes6.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ prw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(prw prwVar, Continuation continuation) {
        super(2, continuation);
        this.j = prwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List split$default;
        gow gowVar;
        YnisonDeviceListParser$YnisonRemoteDeviceDto ynisonDeviceListParser$YnisonRemoteDeviceDto;
        String id;
        String type;
        String appName;
        String appVersion;
        Boolean canBeActive;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        prw prwVar = this.j;
        Object obj2 = null;
        String string = ((SharedPreferences) prwVar.b.getValue()).getString("YNISON_DEVICE_LIST", null);
        if (string != null) {
            gao gaoVar = prwVar.a;
            gaoVar.getClass();
            if (StringsKt.U(string)) {
                obj2 = c5b.a;
            } else {
                split$default = StringsKt__StringsKt.split$default(string, new String[]{"|||"}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    try {
                        ynisonDeviceListParser$YnisonRemoteDeviceDto = (YnisonDeviceListParser$YnisonRemoteDeviceDto) ((Gson) gaoVar.a).d((String) it.next(), YnisonDeviceListParser$YnisonRemoteDeviceDto.class);
                        id = ynisonDeviceListParser$YnisonRemoteDeviceDto.getId();
                    } catch (JsonParseException unused) {
                    }
                    if (id != null && (type = ynisonDeviceListParser$YnisonRemoteDeviceDto.getType()) != null) {
                        fow O = gao.O(type);
                        String name = ynisonDeviceListParser$YnisonRemoteDeviceDto.getName();
                        if (name != null && (appName = ynisonDeviceListParser$YnisonRemoteDeviceDto.getAppName()) != null && (appVersion = ynisonDeviceListParser$YnisonRemoteDeviceDto.getAppVersion()) != null && (canBeActive = ynisonDeviceListParser$YnisonRemoteDeviceDto.getCanBeActive()) != null) {
                            boolean booleanValue = canBeActive.booleanValue();
                            Boolean canBePassive = ynisonDeviceListParser$YnisonRemoteDeviceDto.getCanBePassive();
                            if (canBePassive != null) {
                                gowVar = new gow(id, O, name, appName, appVersion, new wqw(0, vqw.d), false, booleanValue, canBePassive.booleanValue(), false, false, c5b.a);
                                if (gowVar == null) {
                                    arrayList.add(gowVar);
                                }
                            }
                        }
                    }
                    gowVar = null;
                    if (gowVar == null) {
                    }
                }
                obj2 = arrayList;
            }
        }
        return obj2 == null ? c5b.a : obj2;
    }
}
