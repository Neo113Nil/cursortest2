package ru.CryptoPro.AdES;

import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface BaseParameterValidator<T> {
    void validate(T t) throws AdESException;
}
