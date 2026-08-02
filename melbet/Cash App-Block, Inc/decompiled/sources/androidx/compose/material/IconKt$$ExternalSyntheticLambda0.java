package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class IconKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ IconKt$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteStatement prepare;
        int i = this.$r8$classId;
        boolean z = false;
        String str = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 5);
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                ((SemanticsPropertyReceiver) obj).set(SemanticsProperties.Error, str);
                return Unit.INSTANCE;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str);
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver3, new AnnotatedString(str));
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver3, 0);
                return Unit.INSTANCE;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver4, new AnnotatedString(str));
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver4, 0);
                return Unit.INSTANCE;
            case 5:
                SemanticsPropertiesKt.setPaneTitle((SemanticsPropertyReceiver) obj, str);
                return Unit.INSTANCE;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver5, 0);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver5, str);
                return Unit.INSTANCE;
            case 7:
                SemanticsPropertiesKt.setPaneTitle((SemanticsPropertyReceiver) obj, str);
                return Unit.INSTANCE;
            case 8:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver6, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver6, 5);
                return Unit.INSTANCE;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver7 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver7, 1);
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver7, str);
                return Unit.INSTANCE;
            case 10:
                KProperty[] kPropertyArr2 = SemanticsPropertiesKt.$$delegatedProperties;
                ((SemanticsPropertyReceiver) obj).set(SemanticsProperties.Error, str);
                return Unit.INSTANCE;
            case 11:
                Pair pair = (Pair) obj;
                pair.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(pair.first, str));
            case 12:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    prepare.bindText(1, str);
                    if (prepare.step()) {
                        z = ((int) prepare.getLong(0)) != 0;
                    }
                    prepare.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 13:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                prepare = sQLiteConnection2.prepare("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    prepare.bindText(1, str);
                    if (prepare.step()) {
                        z = ((int) prepare.getLong(0)) != 0;
                    }
                    prepare.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 14:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                prepare = sQLiteConnection3.prepare("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (prepare.step()) {
                        arrayList.add(prepare.getText(0));
                    }
                    return arrayList;
                } finally {
                }
            case 15:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                prepare = sQLiteConnection4.prepare("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    prepare.bindText(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (prepare.step()) {
                        arrayList2.add(prepare.getText(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 16:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                prepare = sQLiteConnection5.prepare("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    int totalChangedRows = DimensionKt.getTotalChangedRows(sQLiteConnection5);
                    prepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            case 17:
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                prepare = sQLiteConnection6.prepare("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    prepare.bindText(1, str);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 18:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                a$$ExternalSyntheticBUOutline0 a__externalsyntheticbuoutline0 = WorkSpec.WORK_INFO_MAPPER;
                WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
                workSpecDao.getClass();
                str.getClass();
                Object mo103apply = a__externalsyntheticbuoutline0.mo103apply((List) DBUtil.performBlocking(workSpecDao.__db, true, true, new Navigator$$ExternalSyntheticLambda0(29, str, workSpecDao)));
                mo103apply.getClass();
                return (List) mo103apply;
            case 19:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str);
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, str);
                return Unit.INSTANCE;
            case 21:
                SemanticsPropertyReceiver semanticsPropertyReceiver8 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver8.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver8, str);
                return Unit.INSTANCE;
            case 22:
                SemanticsPropertyReceiver semanticsPropertyReceiver9 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver9.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver9, str);
                return Unit.INSTANCE;
            case 23:
                SemanticsPropertyReceiver semanticsPropertyReceiver10 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver10.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver10, str);
                return Unit.INSTANCE;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver11 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver11.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver11, str);
                return Unit.INSTANCE;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver12 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver12.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver12, str);
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver12, 0);
                return Unit.INSTANCE;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver13 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver13.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver13, str);
                return Unit.INSTANCE;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver14 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver14.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver14, str);
                return Unit.INSTANCE;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver15 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver15.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver15, str);
                return Unit.INSTANCE;
            default:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, str);
                return Unit.INSTANCE;
        }
    }
}
