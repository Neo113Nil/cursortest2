package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormRestoreAddressModel;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;

/* loaded from: classes5.dex */
public final class r6s {
    public final String a;
    public final a6s b;

    public r6s(String str, a6s a6sVar) {
        this.a = str;
        this.b = a6sVar;
    }

    public static ArrayList a(e0l0 e0l0Var) {
        FormRestoreAddressModel formRestoreAddressModel;
        List<qv0> list = e0l0Var.a;
        ArrayList arrayList = new ArrayList();
        for (qv0 qv0Var : list) {
            oo0 oo0Var = qv0Var.a;
            if (oo0Var == null) {
                formRestoreAddressModel = null;
            } else {
                String str = oo0Var.c;
                a0t a0tVar = oo0Var.f;
                CoordinateDto coordinateDto = new CoordinateDto(a0tVar.a, a0tVar.b);
                String str2 = oo0Var.e;
                String str3 = oo0Var.a;
                String str4 = oo0Var.d;
                String str5 = qv0Var.e;
                String str6 = qv0Var.b;
                String str7 = qv0Var.d;
                String str8 = qv0Var.c;
                String str9 = qv0Var.f;
                s9e s9eVar = qv0Var.g;
                formRestoreAddressModel = new FormRestoreAddressModel(str, coordinateDto, str3, str4, str2, str5, str6, str7, str8, str9, new ContactDto(s9eVar.a, s9eVar.b), oo0Var.g);
            }
            if (formRestoreAddressModel != null) {
                arrayList.add(formRestoreAddressModel);
            }
        }
        return arrayList;
    }
}
