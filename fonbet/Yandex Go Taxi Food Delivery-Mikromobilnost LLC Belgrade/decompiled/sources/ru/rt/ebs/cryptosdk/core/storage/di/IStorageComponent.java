package ru.rt.ebs.cryptosdk.core.storage.di;

import defpackage.b3v;
import defpackage.u3v;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/rt/ebs/cryptosdk/core/storage/di/IStorageComponent;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IComponent;", "", "name", "Lru/rt/ebs/cryptosdk/core/storage/keystore/IKeyStorage;", "memoryKeyStorage", "(Ljava/lang/String;)Lru/rt/ebs/cryptosdk/core/storage/keystore/IKeyStorage;", "prefsKeyStorage", "Lzy11;", "clearStorage", "(Ljava/lang/String;)V", "removeStorage", "Lru/rt/ebs/cryptosdk/core/storage/file/IFileManager;", "getFileManager", "()Lru/rt/ebs/cryptosdk/core/storage/file/IFileManager;", "fileManager", "Lu3v;", "getResourceManager", "()Lu3v;", "resourceManager", "Lb3v;", "getKeyStorageManager", "()Lb3v;", "keyStorageManager", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IStorageComponent extends IComponent {
    void clearStorage(String name);

    IFileManager getFileManager();

    b3v getKeyStorageManager();

    u3v getResourceManager();

    IKeyStorage memoryKeyStorage(String name);

    IKeyStorage prefsKeyStorage(String name);

    void removeStorage(String name);
}
