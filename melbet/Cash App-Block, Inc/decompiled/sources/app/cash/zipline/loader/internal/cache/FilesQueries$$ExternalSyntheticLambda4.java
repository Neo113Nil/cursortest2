package app.cash.zipline.loader.internal.cache;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class FilesQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FilesQueries f$1;

    public /* synthetic */ FilesQueries$$ExternalSyntheticLambda4(FilesQueries filesQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                FilesQueries$selectPinnedManifest$2 filesQueries$selectPinnedManifest$2 = FilesQueries$selectPinnedManifest$2.INSTANCE;
                break;
            case 2:
                FilesQueries$get$2 filesQueries$get$2 = FilesQueries$get$2.INSTANCE;
                break;
            case 3:
                FilesQueries$selectPinnedManifestNotFileId$2 filesQueries$selectPinnedManifestNotFileId$2 = FilesQueries$selectPinnedManifestNotFileId$2.INSTANCE;
                break;
            case 4:
                FilesQueries$getById$2 filesQueries$getById$2 = FilesQueries$getById$2.INSTANCE;
                break;
            case 5:
                FilesQueries$selectOldestReady$2 filesQueries$selectOldestReady$2 = FilesQueries$selectOldestReady$2.INSTANCE;
                break;
            default:
                FilesQueries$selectAnyDirtyFile$2 filesQueries$selectAnyDirtyFile$2 = FilesQueries$selectAnyDirtyFile$2.INSTANCE;
                break;
        }
        this.f$1 = filesQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FilesQueries filesQueries = this.f$1;
        switch (i) {
            case 0:
                FilesQueries$selectAnyDirtyFile$2 filesQueries$selectAnyDirtyFile$2 = FilesQueries$selectAnyDirtyFile$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                string2.getClass();
                String string3 = androidCursor.getString(2);
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 3, (EnumColumnAdapter) filesQueries.filesAdapter.b);
                Long l = androidCursor.getLong(4);
                return filesQueries$selectAnyDirtyFile$2.invoke(m, string2, string3, m2, l, re$$ExternalSyntheticOutline0.m(l, androidCursor, 5), androidCursor.getLong(6));
            case 1:
                FilesQueries$selectPinnedManifest$2 filesQueries$selectPinnedManifest$2 = FilesQueries$selectPinnedManifest$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m3 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                String string4 = androidCursor2.getString(1);
                string4.getClass();
                String string5 = androidCursor2.getString(2);
                Enum m4 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 3, (EnumColumnAdapter) filesQueries.filesAdapter.b);
                Long l2 = androidCursor2.getLong(4);
                return filesQueries$selectPinnedManifest$2.invoke(m3, string4, string5, m4, l2, re$$ExternalSyntheticOutline0.m(l2, androidCursor2, 5), androidCursor2.getLong(6));
            case 2:
                FilesQueries$get$2 filesQueries$get$2 = FilesQueries$get$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                Long m5 = re$$ExternalSyntheticOutline0.m(androidCursor3, 0);
                String string6 = androidCursor3.getString(1);
                string6.getClass();
                String string7 = androidCursor3.getString(2);
                Enum m6 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 3, (EnumColumnAdapter) filesQueries.filesAdapter.b);
                Long l3 = androidCursor3.getLong(4);
                return filesQueries$get$2.invoke(m5, string6, string7, m6, l3, re$$ExternalSyntheticOutline0.m(l3, androidCursor3, 5), androidCursor3.getLong(6));
            case 3:
                FilesQueries$selectPinnedManifestNotFileId$2 filesQueries$selectPinnedManifestNotFileId$2 = FilesQueries$selectPinnedManifestNotFileId$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                Long m7 = re$$ExternalSyntheticOutline0.m(androidCursor4, 0);
                String string8 = androidCursor4.getString(1);
                string8.getClass();
                String string9 = androidCursor4.getString(2);
                Enum m8 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 3, (EnumColumnAdapter) filesQueries.filesAdapter.b);
                Long l4 = androidCursor4.getLong(4);
                return filesQueries$selectPinnedManifestNotFileId$2.invoke(m7, string8, string9, m8, l4, re$$ExternalSyntheticOutline0.m(l4, androidCursor4, 5), androidCursor4.getLong(6));
            case 4:
                FilesQueries$getById$2 filesQueries$getById$2 = FilesQueries$getById$2.INSTANCE;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                Long m9 = re$$ExternalSyntheticOutline0.m(androidCursor5, 0);
                String string10 = androidCursor5.getString(1);
                string10.getClass();
                String string11 = androidCursor5.getString(2);
                Enum m10 = NavAction$$ExternalSyntheticOutline0.m(androidCursor5, 3, (EnumColumnAdapter) filesQueries.filesAdapter.b);
                Long l5 = androidCursor5.getLong(4);
                return filesQueries$getById$2.invoke(m9, string10, string11, m10, l5, re$$ExternalSyntheticOutline0.m(l5, androidCursor5, 5), androidCursor5.getLong(6));
            default:
                FilesQueries$selectOldestReady$2 filesQueries$selectOldestReady$2 = FilesQueries$selectOldestReady$2.INSTANCE;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                Long m11 = re$$ExternalSyntheticOutline0.m(androidCursor6, 0);
                String string12 = androidCursor6.getString(1);
                string12.getClass();
                String string13 = androidCursor6.getString(2);
                Enum m12 = NavAction$$ExternalSyntheticOutline0.m(androidCursor6, 3, (EnumColumnAdapter) filesQueries.filesAdapter.b);
                Long l6 = androidCursor6.getLong(4);
                return filesQueries$selectOldestReady$2.invoke(m11, string12, string13, m12, l6, re$$ExternalSyntheticOutline0.m(l6, androidCursor6, 5), androidCursor6.getLong(6));
        }
    }
}
