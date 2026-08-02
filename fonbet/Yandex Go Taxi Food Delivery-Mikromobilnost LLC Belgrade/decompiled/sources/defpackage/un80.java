package defpackage;

import com.yandex.go.places.impl.data.entities.flex.actions.FlexActionWrapper;
import com.yandex.go.places.impl.data.entities.flex.organizations_list.OrganizationsListBboxSharedData;
import com.yandex.go.places.impl.ui.organizations.v2.f;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class un80 implements e9c0 {
    public final /* synthetic */ int a;
    public final KSerializer b;
    public final /* synthetic */ f c;

    public un80(f fVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = fVar;
                this.b = FlexActionWrapper.Companion.serializer();
                break;
            default:
                this.c = fVar;
                this.b = OrganizationsListBboxSharedData.Companion.serializer();
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String a() {
        switch (this.a) {
            case 0:
                return "bboxSharedDataParser";
            default:
                return "showPopupActionSharedDataParser";
        }
    }

    @Override // defpackage.e9c0
    public final void b(Object obj) {
        int i = this.a;
        f fVar = this.c;
        switch (i) {
            case 0:
                OrganizationsListBboxSharedData organizationsListBboxSharedData = obj instanceof OrganizationsListBboxSharedData ? (OrganizationsListBboxSharedData) obj : null;
                if (organizationsListBboxSharedData != null) {
                    fVar.c0.l(organizationsListBboxSharedData.a);
                    break;
                }
                break;
            default:
                FlexActionWrapper flexActionWrapper = obj instanceof FlexActionWrapper ? (FlexActionWrapper) obj : null;
                if ((flexActionWrapper != null ? flexActionWrapper.a : null) instanceof w8s0) {
                    fVar.k0 = (w8s0) flexActionWrapper.a;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e9c0
    public final String c() {
        switch (this.a) {
            case 0:
                return "bbox_field";
            default:
                return "organizations_list_filters_pop_up_action";
        }
    }

    @Override // defpackage.e9c0
    public final KSerializer d() {
        switch (this.a) {
        }
        return this.b;
    }
}
