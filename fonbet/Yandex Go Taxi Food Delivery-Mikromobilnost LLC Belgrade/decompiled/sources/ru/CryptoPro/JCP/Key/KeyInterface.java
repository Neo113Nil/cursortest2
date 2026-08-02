package ru.CryptoPro.JCP.Key;

import java.security.spec.KeySpec;
import javax.security.auth.Destroyable;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public interface KeyInterface extends Cloneable, KeySpec, Destroyable {
    void clear();

    Object clone() throws CloneNotSupportedException;

    ParamsInterface getParams();

    void setParams(ParamsInterface paramsInterface);
}
