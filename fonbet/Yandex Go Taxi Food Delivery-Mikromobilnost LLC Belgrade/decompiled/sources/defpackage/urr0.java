package defpackage;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress;
import com.yandex.go.sharing_personal_goals.data.model.y;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class urr0 extends xqt {
    public static final urr0 e = new urr0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, y.INSTANCE.serializer(), qoi0.a(y.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("accept", SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept.Companion.serializer(), qoi0.a(SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept.class)), new f9("in_progress", SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress.Companion.serializer(), qoi0.a(SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress.class)), new f9("completed", SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Companion.serializer(), qoi0.a(SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.class)));
    }
}
