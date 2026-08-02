package ru.rt.ebs.cryptosdk.core.storage.keystore;

import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0000H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH&J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\fH&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003H&J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0011H&J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH&J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH&J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0003H&J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000fH&J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0011H&J\u001e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bH&J\b\u0010\u001e\u001a\u00020\u0000H&¨\u0006\u001f"}, d2 = {"Lru/rt/ebs/cryptosdk/core/storage/keystore/IKeyStorage;", "", "initialize", "", "release", "save", "hasKey", "key", "", "getString", "defValue", "getInt", "", "getBoolean", "getFloat", "", "getLong", "", "getStringSet", "", "putString", "value", "putInt", "putBoolean", "putFloat", "putLong", "putStringSet", "remove", "removeAllWith", AppSettingsContract$Setting.COLUMN_PREFIX, "removeAll", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IKeyStorage {
    boolean getBoolean(String key, boolean defValue);

    float getFloat(String key, float defValue);

    int getInt(String key, int defValue);

    long getLong(String key, long defValue);

    String getString(String key, String defValue);

    Set<String> getStringSet(String key, Set<String> defValue);

    boolean hasKey(String key);

    boolean initialize();

    IKeyStorage putBoolean(String key, boolean value);

    IKeyStorage putFloat(String key, float value);

    IKeyStorage putInt(String key, int value);

    IKeyStorage putLong(String key, long value);

    IKeyStorage putString(String key, String value);

    IKeyStorage putStringSet(String key, Set<String> value);

    boolean release();

    IKeyStorage remove(String key);

    IKeyStorage removeAll();

    IKeyStorage removeAllWith(String prefix);

    IKeyStorage save();
}
