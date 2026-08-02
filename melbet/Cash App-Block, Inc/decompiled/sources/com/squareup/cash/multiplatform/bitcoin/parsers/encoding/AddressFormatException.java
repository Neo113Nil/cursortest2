package com.squareup.cash.multiplatform.bitcoin.parsers.encoding;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "InvalidCharacter", "InvalidDataLength", "InvalidChecksum", "InvalidPrefix", "UnexpectedWitnessVersion", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidCharacter;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidChecksum;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidDataLength;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidPrefix;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$UnexpectedWitnessVersion;", "bitcoin-parsers_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AddressFormatException extends IllegalArgumentException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidCharacter;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException;", "bitcoin-parsers_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InvalidCharacter extends AddressFormatException {
        public InvalidCharacter(char c, int i) {
            super("Invalid character '" + c + "' at position " + i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidChecksum;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException;", "bitcoin-parsers_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InvalidChecksum extends AddressFormatException {
        public InvalidChecksum() {
            super("Checksum does not validate");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidDataLength;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException;", "bitcoin-parsers_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InvalidDataLength extends AddressFormatException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$InvalidPrefix;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException;", "bitcoin-parsers_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InvalidPrefix extends AddressFormatException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException$UnexpectedWitnessVersion;", "Lcom/squareup/cash/multiplatform/bitcoin/parsers/encoding/AddressFormatException;", "bitcoin-parsers_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UnexpectedWitnessVersion extends AddressFormatException {
    }
}
