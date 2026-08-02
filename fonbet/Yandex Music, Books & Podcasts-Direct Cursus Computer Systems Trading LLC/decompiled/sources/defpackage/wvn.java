package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class wvn implements RemoteViewsService.RemoteViewsFactory {
    public static final q5i e;
    public final RemoteViewsCompatService a;
    public final int b;
    public final int c;
    public q5i d = e;

    static {
        long[] jArr = new long[0];
        RemoteViews[] remoteViewsArr = new RemoteViews[0];
        q5i q5iVar = new q5i();
        q5iVar.c = jArr;
        q5iVar.d = remoteViewsArr;
        q5iVar.a = false;
        q5iVar.b = 1;
        if (jArr.length != remoteViewsArr.length) {
            xq0.x("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = CollectionsKt.w0(CollectionsKt.z0(arrayList)).size();
        if (size > 1) {
            xq0.o(dfi.c(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
            throw null;
        }
        e = q5iVar;
    }

    public wvn(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.a = remoteViewsCompatService;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        Long l;
        RemoteViewsCompatService remoteViewsCompatService = this.a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        sb.append(i);
        sb.append(':');
        sb.append(this.c);
        q5i q5iVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] decode = Base64.decode(string, 0);
            decode.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                byte[] bArr = new byte[obtain.readInt()];
                obtain.readByteArray(bArr);
                String readString = obtain.readString();
                readString.getClass();
                long readLong = obtain.readLong();
                obtain.recycle();
                if (Intrinsics.d(Build.VERSION.INCREMENTAL, readString)) {
                    try {
                        l = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? jo0.l(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)) : r0.versionCode);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e2);
                        l = null;
                    }
                    if (l == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else if (l.longValue() != readLong) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            obtain = Parcel.obtain();
                            obtain.getClass();
                            try {
                                obtain.unmarshall(bArr, 0, bArr.length);
                                obtain.setDataPosition(0);
                                q5i q5iVar2 = new q5i(obtain);
                                obtain.recycle();
                                q5iVar = q5iVar2;
                            } finally {
                            }
                        } catch (Throwable th) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                }
            } finally {
            }
        }
        if (q5iVar == null) {
            q5iVar = e;
        }
        this.d = q5iVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.d.c).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.d.c)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.d.a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
