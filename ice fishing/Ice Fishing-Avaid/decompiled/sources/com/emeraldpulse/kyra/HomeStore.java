package com.emeraldpulse.kyra;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nJ\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\u0014\u0010\u0017\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\nR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/emeraldpulse/kyra/HomeStore;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "loadRooms", "", "Lcom/emeraldpulse/kyra/RoomChecklist;", "loadSupplies", "Lcom/emeraldpulse/kyra/Supply;", "loadFixes", "Lcom/emeraldpulse/kyra/FixTask;", "loadCosts", "Lcom/emeraldpulse/kyra/CostNote;", "saveRooms", "", "value", "saveSupplies", "saveFixes", "saveCosts", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class HomeStore {
    private final SharedPreferences preferences;

    public HomeStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.preferences = context.getApplicationContext().getSharedPreferences("emerald_pulse_home_store", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.emeraldpulse.kyra.MainActivityKt.decodeRooms(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<RoomChecklist> loadRooms() {
        List<RoomChecklist> defaultRooms;
        List<RoomChecklist> decodeRooms;
        String string = this.preferences.getString("rooms", null);
        if (string != null && decodeRooms != null) {
            return decodeRooms;
        }
        defaultRooms = MainActivityKt.defaultRooms();
        return defaultRooms;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.emeraldpulse.kyra.MainActivityKt.decodeSupplies(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Supply> loadSupplies() {
        List<Supply> defaultSupplies;
        List<Supply> decodeSupplies;
        String string = this.preferences.getString("supplies", null);
        if (string != null && decodeSupplies != null) {
            return decodeSupplies;
        }
        defaultSupplies = MainActivityKt.defaultSupplies();
        return defaultSupplies;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.emeraldpulse.kyra.MainActivityKt.decodeFixes(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<FixTask> loadFixes() {
        List<FixTask> defaultFixes;
        List<FixTask> decodeFixes;
        String string = this.preferences.getString("fixes", null);
        if (string != null && decodeFixes != null) {
            return decodeFixes;
        }
        defaultFixes = MainActivityKt.defaultFixes();
        return defaultFixes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.emeraldpulse.kyra.MainActivityKt.decodeCosts(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<CostNote> loadCosts() {
        List<CostNote> defaultCosts;
        List<CostNote> decodeCosts;
        String string = this.preferences.getString("costs", null);
        if (string != null && decodeCosts != null) {
            return decodeCosts;
        }
        defaultCosts = MainActivityKt.defaultCosts();
        return defaultCosts;
    }

    public final void saveRooms(List<RoomChecklist> value) {
        JSONArray encodeRooms;
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.preferences.edit();
        encodeRooms = MainActivityKt.encodeRooms(value);
        edit.putString("rooms", encodeRooms.toString()).apply();
    }

    public final void saveSupplies(List<Supply> value) {
        JSONArray encodeSupplies;
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.preferences.edit();
        encodeSupplies = MainActivityKt.encodeSupplies(value);
        edit.putString("supplies", encodeSupplies.toString()).apply();
    }

    public final void saveFixes(List<FixTask> value) {
        JSONArray encodeFixes;
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.preferences.edit();
        encodeFixes = MainActivityKt.encodeFixes(value);
        edit.putString("fixes", encodeFixes.toString()).apply();
    }

    public final void saveCosts(List<CostNote> value) {
        JSONArray encodeCosts;
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.preferences.edit();
        encodeCosts = MainActivityKt.encodeCosts(value);
        edit.putString("costs", encodeCosts.toString()).apply();
    }
}
