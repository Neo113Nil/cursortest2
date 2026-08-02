package androidx.work.impl.workers;

import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda4;
import androidx.work.impl.model.WorkTagDao_Impl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class DiagnosticsWorkerKt {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("DiagnosticsWrkr");

    public static final String access$workSpecRows(WorkNameDao_Impl workNameDao_Impl, WorkTagDao_Impl workTagDao_Impl, SystemIdInfoDao_Impl systemIdInfoDao_Impl, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            WorkGenerationalId generationalId = Room.generationalId(workSpec);
            String str = workSpec.id;
            systemIdInfoDao_Impl.getClass();
            String str2 = generationalId.workSpecId;
            int i = generationalId.generation;
            str2.getClass();
            SystemIdInfo systemIdInfo = (SystemIdInfo) DBUtil.performBlocking(systemIdInfoDao_Impl.__db, true, false, new WorkSpecDao_Impl$$ExternalSyntheticLambda4(str2, i, 1));
            Integer valueOf = systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null;
            workNameDao_Impl.getClass();
            str.getClass();
            String joinToString$default = CollectionsKt.joinToString$default((List) DBUtil.performBlocking(workNameDao_Impl.__db, true, false, new IconKt$$ExternalSyntheticLambda0(str, 14)), ",", null, null, 0, null, null, 62);
            workTagDao_Impl.getClass();
            String joinToString$default2 = CollectionsKt.joinToString$default((List) DBUtil.performBlocking(workTagDao_Impl.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 13)), ",", null, null, 0, null, null, 62);
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("\n", str, "\t ");
            NavAction$$ExternalSyntheticOutline0.m(m3m, workSpec.workerClassName, "\t ", valueOf, "\t ");
            m3m.append(workSpec.state.name());
            m3m.append("\t ");
            m3m.append(joinToString$default);
            m3m.append("\t ");
            m3m.append(joinToString$default2);
            m3m.append('\t');
            sb.append(m3m.toString());
        }
        return sb.toString();
    }
}
