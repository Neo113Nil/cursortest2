package ru.yandex.yx_platform_api;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.up3;
import defpackage.vp3;
import defpackage.xp3;
import defpackage.yeo;
import defpackage.yp3;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"ru/yandex/yx_platform_api/AutoConnectionDetector$CarConnectionQueryHandler", "Landroid/content/AsyncQueryHandler;", "Landroid/content/ContentResolver;", "resolver", "<init>", "(Landroid/content/ContentResolver;)V", "", ClidProvider.STATE, "Lzy11;", "onConnectionState", "(I)V", "", CRLReasonCodeExtension.REASON, "onMissingState", "(Ljava/lang/String;)V", "Lxp3;", "listener", "addListener", "(Lxp3;)V", "removeListener", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "", "cookie", "Landroid/database/Cursor;", "response", "onQueryComplete", "(ILjava/lang/Object;Landroid/database/Cursor;)V", "", "listeners", "Ljava/util/Set;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutoConnectionDetector$CarConnectionQueryHandler extends AsyncQueryHandler {
    private final Set<xp3> listeners;

    public AutoConnectionDetector$CarConnectionQueryHandler(ContentResolver contentResolver) {
        super(contentResolver);
        this.listeners = new LinkedHashSet();
    }

    private final void onConnectionState(int state) {
        for (xp3 xp3Var : this.listeners) {
            up3 up3Var = new up3(state);
            yeo yeoVar = ((yp3) xp3Var).a;
            if (yeoVar != null) {
                yeoVar.success(kotlin.collections.b.i(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "connectionState"), new Pair(ClidProvider.STATE, Integer.valueOf(up3Var.a))));
            }
        }
    }

    private final void onMissingState(String reason) {
        for (xp3 xp3Var : this.listeners) {
            vp3 vp3Var = new vp3(reason);
            yeo yeoVar = ((yp3) xp3Var).a;
            if (yeoVar != null) {
                yeoVar.success(kotlin.collections.b.i(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "missingState"), new Pair(CRLReasonCodeExtension.REASON, vp3Var.a)));
            }
        }
    }

    public final void addListener(xp3 listener) {
        this.listeners.add(listener);
    }

    @Override // android.content.AsyncQueryHandler
    public void onQueryComplete(int token, Object cookie, Cursor response) {
        if (token != 42) {
            return;
        }
        if (response == null) {
            onMissingState("Null response from content provider when checking connection to the car");
            return;
        }
        int columnIndex = response.getColumnIndex("CarConnectionState");
        if (columnIndex < 0) {
            onMissingState("Connection to car response is missing the connection type");
            return;
        }
        try {
            if (response.moveToNext()) {
                onConnectionState(response.getInt(columnIndex));
            } else {
                onMissingState("Connection to car response is empty");
            }
        } catch (RuntimeException e) {
            onMissingState(e.toString());
        }
    }

    public final void removeListener(xp3 listener) {
        this.listeners.remove(listener);
    }
}
